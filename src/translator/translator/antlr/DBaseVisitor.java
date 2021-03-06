package translator.antlr;

import interfaces.CallStack;
import interfaces.ScopeStack;
import interfaces.SymTable;
import implementations.CallStackImpl;
import implementations.ScopeStackImpl;
import translator.runtime.tree.AbstractParseTreeVisitor;
import translator.runtime.tree.TerminalNode;
import translator.codegen.CodeGenerator;

import java.util.List;

public class DBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements DVisitor<T> {

    private CodeGenerator generator;

    private ScopeStack scopeStack = new ScopeStackImpl();
    private final CallStack callStack = new CallStackImpl();


    public DBaseVisitor(CodeGenerator gen) {
        generator = gen;
    }

    @Override
    public T visitCompilation_unit(DParser.Compilation_unitContext ctx) throws Exception {
        return visitChildren(ctx);
    }

    @Override
    public T visitProgram(DParser.ProgramContext ctx) throws Exception {
        generator.add(ctx.start.getLine(), "scopeStack.newScope();");
        scopeStack.newScope();

        visitScopeNoNewScope(ctx.scope());

        generator.add(ctx.start.getLine(), "scopeStack.popScope();");
        scopeStack.popScope();
        return null;
    }

    @Override
    public T visitScope(DParser.ScopeContext ctx) throws Exception {
        generator.add(ctx.start.getLine(), "enterScope();");

        SymTable origin = scopeStack.getScope();
        scopeStack.newScope(origin);

        visitChildren(ctx);

        generator.add(ctx.start.getLine(), "exitScope();");
        scopeStack.popScope();
        return null;
    }

    public T visitScopeNoNewScope(DParser.ScopeContext ctx) throws Exception {
        return visitChildren(ctx);
    }

    public T visitScopeFromFunction(DParser.ScopeContext ctx, List<TerminalNode> args) throws Exception {

        if (args != null) {
            for (int i = args.size() - 1; i >= 0; i--) {
                generator.add(ctx.start.getLine(), "add(\"" + args.get(i).getSymbol().getText() + "\");");
                generator.add(ctx.start.getLine(), "assign(\"" + args.get(i).getSymbol().getText() + "\");");

                scopeStack.add(args.get(i).getSymbol().getText());
            }

        }
        visitChildren(ctx);
        return null;
    }

    @Override
    public T visitStatement(DParser.StatementContext ctx) throws Exception {
        return visitChildren(ctx);
    }

    @Override
    public T visitInvocation(DParser.InvocationContext ctx) throws Exception {

        for (DParser.ExpressionContext expr : ctx.expression()) {
            visitExpression(expr);
        }
        generator.add(ctx.start.getLine(), "vpush(\"" + ctx.IDENT().getText() + "\");");
        generator.add(ctx.start.getLine(), "invoke();");

        try {
            scopeStack.get(ctx.IDENT().getText());
        } catch (Exception e) {
            throw new Exception("Line: " + ctx.start.getLine() + " error: " + e.getMessage());
        }

        return null;
    }

    @Override
    public T visitR_if(DParser.R_ifContext ctx) throws Exception {

        visitExpression((DParser.ExpressionContext) ctx.getChild(1));
        generator.add(ctx.start.getLine(), "if(bpop()) {");
        visitScope((DParser.ScopeContext) ctx.getChild(3));

        if (ctx.getChildCount() == 7) {
            generator.add(ctx.start.getLine(), "} else {");
            visitScope((DParser.ScopeContext) ctx.getChild(5));
        }

        generator.add(ctx.start.getLine(), "}");
        return null;
    }

    @Override
    public T visitR_while(DParser.R_whileContext ctx) throws Exception {

        visitExpression(ctx.expression());
        generator.add(ctx.start.getLine(), "while(bpop()) {");
        visitScope(ctx.scope());
        visitExpression(ctx.expression());
        generator.add(ctx.start.getLine(), "}");
        return null;
    }

    @Override
    public T visitR_for(DParser.R_forContext ctx) throws Exception {
        switch (ctx.children.get(4).getText()) {
            case "..":
                // for i in 1..10 loop %scope% end
                generator.add(ctx.start.getLine(), "enterScope();");

                SymTable origin = scopeStack.getScope();
                scopeStack.newScope(origin);

                generator.add(ctx.start.getLine(), "add(\"" + ctx.IDENT().getText() + "\");");

                scopeStack.add(ctx.IDENT().getText());

                visitExpression(ctx.expression(0));
                generator.add(ctx.start.getLine(), "assign(\"" + ctx.IDENT().getText() + "\");");

                visitExpression(ctx.expression(1));
                generator.add(ctx.start.getLine(), "vpush(\"" + ctx.IDENT().getText() + "\");");
                generator.add(ctx.start.getLine(), "lessequal();");
                generator.add(ctx.start.getLine(), "while(bpop()) {");

                visitScope(ctx.scope());
                visitExpression(ctx.expression(1));

                generator.add(ctx.start.getLine(), "vpush(\"" + ctx.IDENT().getText() + "\");");
                generator.add(ctx.start.getLine(), "vpush(1);");
                generator.add(ctx.start.getLine(), "plus();");
                generator.add(ctx.start.getLine(), "assign(\"" + ctx.IDENT().getText() + "\");");
                generator.add(ctx.start.getLine(), "vpush(\"" + ctx.IDENT().getText() + "\");");
                generator.add(ctx.start.getLine(), "lessequal();");
                generator.add(ctx.start.getLine(), "}");
                generator.add(ctx.start.getLine(), "exitScope();");

                break;
            case "loop":
                // for 1..10 loop %scope% end
                visitExpression(ctx.expression(1));
                visitExpression(ctx.expression(0));
                generator.add(ctx.start.getLine(), "forloop(() -> {");
                visitScope(ctx.scope());
                generator.add(ctx.start.getLine(), "});");
                break;
        }
        return null;
    }

    @Override
    public T visitPrint(DParser.PrintContext ctx) throws Exception {

        for (DParser.ExpressionContext expr : ctx.expression()) {
            visitExpression(expr);
            generator.add(ctx.start.getLine(), "cprint();");
        }
        return null;
//        return visitChildren(ctx);
    }

    @Override
    public T visitR_return(DParser.R_returnContext ctx) throws Exception {

        visitExpression(ctx.expression());
        generator.add(ctx.start.getLine(), "exitfunc();");
        generator.add(ctx.start.getLine(), "if (true) {return;}");
        return null;
    }

    @Override
    public T visitAssignment(DParser.AssignmentContext ctx) throws Exception {
        visitExpression(ctx.expression());
        visitReferenceFromAssignment(ctx.reference());
        return null;
    }

    @Override
    public T visitDeclaration(DParser.DeclarationContext ctx) throws Exception {
        return visitChildren(ctx);
    }

    @Override
    public T visitVar_definition(DParser.Var_definitionContext ctx) throws Exception {

        scopeStack.add(ctx.IDENT().getText());

        generator.add(ctx.start.getLine(), "add(\"" + ctx.IDENT().getText() + "\");");
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
            generator.add(ctx.start.getLine(), "assign(\"" + ctx.IDENT().getText() + "\");");
        }
        return null;
    }


    @Override
    public T visitReference(DParser.ReferenceContext ctx) throws Exception {

        // Just IDENT, rule 1
        if (ctx.getChildCount() == 1) {
            try {
                scopeStack.get(ctx.IDENT().getText());
            } catch (Exception e) {
                throw new Exception("Line: " + ctx.start.getLine() + " error: " + e.getMessage());
            }
            generator.add(ctx.start.getLine(), "vpush(\"" + ctx.IDENT() + "\");");
        } else {
            String elem = ctx.getChild(1).getText();

            switch (elem) {
                case "[":
                    visitReference(ctx.reference());
                    visitExpression(ctx.expression(0));
                    generator.add(ctx.start.getLine(), "readcort();");
                    break;
                case "(":
                    for (DParser.ExpressionContext expr : ctx.expression()) {
                        visitExpression(expr);
                    }
                    visitReference(ctx.reference());
                    generator.add(ctx.start.getLine(), "invoke();");
                    break;
                case ".":
                    visitReference(ctx.reference());
                    generator.add(ctx.start.getLine(), "vpush(new Text(\"" + ctx.children.get(2).getText() + "\"));");
                    generator.add(ctx.start.getLine(), "readobj();");
                    break;
            }
        }

        return null;
    }

    public T visitReferenceFromAssignment(DParser.ReferenceContext ctx) throws Exception {

        // Just IDENT, rule 1
        if (ctx.getChildCount() == 1) {
            try {
                scopeStack.get(ctx.IDENT().getText());
            } catch (Exception e) {
                throw new Exception("Line: " + ctx.start.getLine() + " error: " + e.getMessage());
            }
            generator.add(ctx.start.getLine(), "assign(\"" + ctx.IDENT().getText() + "\");");
        } else {
            String elem = ctx.getChild(1).getText();

            switch (elem) {
                case "[":
                    visitReference(ctx.reference());
                    generator.add(ctx.start.getLine(), "swap();");
                    visitExpression(ctx.expression(0));
                    generator.add(ctx.start.getLine(), "assigncort();");
                    break;
                case ".":
                    visitReference(ctx.reference());
                    generator.add(ctx.start.getLine(), "swap();");
                    visitExpression(ctx.expression(0));
                    generator.add(ctx.start.getLine(), "assignobj();");
                    break;
            }
        }
        return null;
    }

    @Override
    public T visitExpression(DParser.ExpressionContext ctx) throws Exception {

        if (ctx.getChildCount() == 1) {
            // No math operation
            visitChildren(ctx);
        } else {
            for (int i = ctx.relation().size() - 1; i >= 0; i--) {
                visitRelation(ctx.relation(i));
            }
            for (int i = 1; i < ctx.getChildCount(); i = i + 2) {
                switch (ctx.getChild(i).getText()) {
                    case "or":
                        generator.add(ctx.start.getLine(), "or();");
                        break;
                    case "and":
                        generator.add(ctx.start.getLine(), "and();");
                        break;
                    case "xor":
                        generator.add(ctx.start.getLine(), "xor();");
                        break;
                }
            }

        }
        return null;
    }

    @Override
    public T visitRelation(DParser.RelationContext ctx) throws Exception {
        // the relation is " X op Y"
        if (ctx.children.size() == 3) {
            visitSimple((DParser.SimpleContext) ctx.children.get(2));
            visitSimple((DParser.SimpleContext) ctx.children.get(0));

            switch (ctx.children.get(1).getText()) {
                case ">":
                    generator.add(ctx.start.getLine(), "greater();");
                    break;
                case ">=":
                    generator.add(ctx.start.getLine(), "greaterequals()");
                    break;
                case "<":
                    generator.add(ctx.start.getLine(), "less();");
                    break;
                case "<=":
                    generator.add(ctx.start.getLine(), "lessequal();");
                    break;
                case "=":
                    generator.add(ctx.start.getLine(), "equals();");
                    break;
                case "/=":
                    generator.add(ctx.start.getLine(), "notequal();");
                    break;
            }
        } else {
            visitChildren(ctx);
        }
        return null;
    }

    @Override
    public T visitSimple(DParser.SimpleContext ctx) throws Exception {

        if (ctx.getChildCount() == 1) {
            // No math operation
            visitChildren(ctx);
        } else {
            for (int i = ctx.summand().size() - 1; i >= 0; i--) {
                visitSummand(ctx.summand(i));
            }


            for (int i = 1; i < ctx.getChildCount(); i = i + 2) {
                switch (ctx.getChild(i).getText()) {
                    case "+":
                        generator.add(ctx.start.getLine(), "plus();");
                        break;
                    case "-":
                        generator.add(ctx.start.getLine(), "minus();");
                        break;
                }
            }
        }
        return null;
    }

    @Override
    public T visitSummand(DParser.SummandContext ctx) throws Exception {
        if (ctx.getChildCount() == 1) {
            // No math operation
            visitChildren(ctx);
        } else {
            // mathematical operation
            for (int i = ctx.factor().size() - 1; i >= 0; i--) {
                visitFactor(ctx.factor(i));
            }

            for (int i = 1; i < ctx.getChildCount(); i = i + 2) {
                switch (ctx.getChild(i).getText()) {
                    case "*":
                        generator.add(ctx.start.getLine(), "multiply();");
                        break;
                    case "/":
                        generator.add(ctx.start.getLine(), "divide();");
                        break;
                }
            }
        }
        return null;
    }

    @Override
    public T visitFactor(DParser.FactorContext ctx) throws Exception {

        if (ctx.children.get(0).getText().equals("+") ||
                ctx.children.get(0).getText().equals("-") ||
                ctx.children.get(0).getText().equals("not")) {

            visitPrimary(ctx.primary());

            switch (ctx.children.get(0).getText()) {
                case "+":
                    break;
                case "-":
                    generator.add(ctx.start.getLine(), "vpush(-1);");
                    generator.add(ctx.start.getLine(), "multiply();");
                    break;
                case "not":
                    generator.add(ctx.start.getLine(), "not();");
                    break;
            }
        } else if (ctx.type_indicator() != null) {
            visitReference(ctx.reference());
            visitType_indicator(ctx.type_indicator());
            generator.add(ctx.start.getLine(), "checktype();");
        } else if (ctx.children.get(0).getText().equals("size")) {

        } else {
            visitChildren(ctx);
        }
        return null;
    }

    @Override
    public T visitPrimary(DParser.PrimaryContext ctx) throws Exception {
        if (ctx.children.get(0).getText().equals("if")) {
            visitExpression(ctx.expression(0));
            generator.add(ctx.start.getLine(), "if (bpop()) {");
            visitExpression(ctx.expression(1));
            generator.add(ctx.start.getLine(), "} else {");
            visitExpression(ctx.expression(2));
            generator.add(ctx.start.getLine(), "}");
        } else {
            visitChildren(ctx);
        }
        return null;
    }

    @Override
    public T visitReadInt(DParser.ReadIntContext ctx) {
        generator.add(ctx.start.getLine(), "readInt();");
        return null;
    }

    @Override
    public T visitReadReal(DParser.ReadRealContext ctx) {
        generator.add(ctx.start.getLine(), "readReal();");
        return null;
    }

    @Override
    public T visitReadString(DParser.ReadStringContext ctx) {
        generator.add(ctx.start.getLine(), "readString();");
        return null;
    }

    @Override
    public T visitFunction_literal(DParser.Function_literalContext ctx) throws Exception {
        generator.add(ctx.start.getLine(), "vpush(new Function(() -> {");
        visitBody(ctx.body(), ctx.IDENT());
        generator.add(ctx.start.getLine(), "}));");
        return null;
    }

    public void visitBody(DParser.BodyContext ctx, List<TerminalNode> args) throws Exception {

        if (ctx.scope() != null) {
            visitScopeFromFunction(ctx.scope(), args);
        } else {
            for (int i = args.size() - 1; i >= 0; i--) {
                generator.add(ctx.start.getLine(), "add(\"" + args.get(i).getSymbol().getText() + "\");");
                generator.add(ctx.start.getLine(), "assign(\"" + args.get(i).getSymbol().getText() + "\");");
                scopeStack.add(args.get(i).getSymbol().getText());
            }
            visitExpression(ctx.expression());

            SymTable target = callStack.pop();
            while (target != scopeStack.getScope()) {
                scopeStack.popScope();
            }
            generator.add(ctx.start.getLine(), "exitfunc();");
            generator.add(ctx.start.getLine(), "if (true) {return;}");
        }
    }

    @Override
    public T visitBody(DParser.BodyContext ctx) throws Exception {
        return visitChildren(ctx);
    }

    @Override
    public T visitType_indicator(DParser.Type_indicatorContext ctx) {
        switch (ctx.children.size()) {
            case 1:
                generator.add(ctx.start.getLine(), "vpush(new TypeIndicator(\"" + ctx.children.get(0).getText() + "\"));");
                break;
            case 2:
                generator.add(ctx.start.getLine(), "vpush(new TypeIndicator(\"" + ctx.children.get(0).getText() + ctx.children.get(1).getText() + "\"));");
                break;
        }
        return null;
    }

    @Override
    public T visitLiteral(DParser.LiteralContext ctx) throws Exception {
        if (ctx.STRING() != null) {
            generator.add(ctx.start.getLine(), "vpush( new Text(" + ctx.getChild(0).getText() + "));");
        } else if (ctx.tuple() != null || ctx.object() != null) {
            return visitChildren(ctx);
        } else if (ctx.getChild(0).getText().equals("empty")) {
            generator.add(ctx.start.getLine(), "vpush(null);");
        } else {
            generator.add(ctx.start.getLine(), "vpush(" + ctx.getChild(0).getText() + ");");
        }
        return null;
    }

    @Override
    public T visitObject(DParser.ObjectContext ctx) throws Exception {
        generator.add(ctx.start.getLine(), "vpush(new Structure());");
        for (int i = 1; i <= ctx.var_definition().size(); i++) {
            generator.add(ctx.start.getLine(), "dup();");
            visitVar_definitionFromObject(ctx.var_definition(i - 1));
            generator.add(ctx.start.getLine(), "assignobj();");
        }
        return null;
    }


    public T visitVar_definitionFromObject(DParser.Var_definitionContext ctx) throws Exception {
        generator.add(ctx.start.getLine(), "vpush(new Text(\"" + ctx.IDENT().getSymbol().getText() + "\"));");
        visitExpression(ctx.expression());
        return null;
    }

    @Override
    public T visitTuple(DParser.TupleContext ctx) throws Exception {
        generator.add(ctx.start.getLine(), "vpush(new Cortege());");
        for (int i = 1; i <= ctx.expression().size(); i++) {
            generator.add(ctx.start.getLine(), "dup();");
            visitExpression(ctx.expression(i - 1));
            generator.add(ctx.start.getLine(), "vpush(" + i + ");");
            generator.add(ctx.start.getLine(), "assigncort();");
        }
        return null;
    }
}
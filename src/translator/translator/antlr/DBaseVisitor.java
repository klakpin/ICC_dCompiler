// Generated from /home/ilya/Documents/Compilers/Compiler project/src/translator/translator/antlr/D.g4 by ANTLR 4.7
package translator.antlr;

import org.runtime.tree.AbstractParseTreeVisitor;
import org.runtime.tree.TerminalNode;
import translator.codegen.CodeGenerator;

import java.util.List;

/**
 * This class provides an empty implementation of {@link DVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class DBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements DVisitor<T> {

    public CodeGenerator generator;

    public DBaseVisitor(CodeGenerator gen) {
        generator = gen;
    }

    @Override
    public T visitCompilation_unit(DParser.Compilation_unitContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitProgram(DParser.ProgramContext ctx) {
        generator.add("scopeStack.newScope();");
        visitScopeNoNewScope(ctx.scope());
        generator.add("scopeStack.popScope();");
        return null;
    }

    @Override
    public T visitScope(DParser.ScopeContext ctx) {
        generator.add("enterScope();");
        visitChildren(ctx);
        generator.add("exitScope();");
        return null;
    }

    public T visitScopeNoNewScope(DParser.ScopeContext ctx) {
        return visitChildren(ctx);
    }

    public T visitScopeFromFunction(DParser.ScopeContext ctx, List<TerminalNode> args) {
        //TODO check order
        for (int i = args.size() - 1; i >= 0; i--) {
            generator.add("add(\"" + args.get(i).getSymbol().getText() + "\");");
            generator.add("assign(\"" + args.get(i).getSymbol().getText() + "\");");
        }
        visitChildren(ctx);
        return null;
    }

    @Override
    public T visitStatement(DParser.StatementContext ctx) {
        return visitChildren(ctx);
    }


    @Override
    public T visitInvocation(DParser.InvocationContext ctx) {

        for (DParser.ExpressionContext expr : ctx.expression()) {
            visitExpression(expr);
        }
        generator.add("vpush(\"" + ctx.IDENT() + "\");");
        generator.add("invoke();");
        return null;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */


    @Override
    public T visitR_if(DParser.R_ifContext ctx) {

        visitExpression((DParser.ExpressionContext) ctx.getChild(1));
        generator.add("if(bpop()) {");
        visitScope((DParser.ScopeContext) ctx.getChild(3));

        if (ctx.getChildCount() == 7) {
            generator.add("} else {");
            visitScope((DParser.ScopeContext) ctx.getChild(5));
        }

        generator.add("}");
        return null;
    }

    @Override
    public T visitR_while(DParser.R_whileContext ctx) {

        visitExpression(ctx.expression());
        generator.add("while(bpop()) {");
        visitScope(ctx.scope());
        visitExpression(ctx.expression());
        generator.add("}");

        return null;
    }

    @Override
    public T visitR_for(DParser.R_forContext ctx) {
        switch (ctx.children.get(4).getText()) {
            case "..":
                // for i in 1..10 loop %scope% end
                generator.add("enterScope();");
                generator.add("add(\"" + ctx.IDENT() + "\");");
                visitExpression(ctx.expression(0));
                generator.add("assign(\"" + ctx.IDENT() + "\");");

                visitExpression(ctx.expression(1));
                generator.add("vpush(\"" + ctx.IDENT() + "\");");
                generator.add("lessequal();");
                generator.add("while(bpop()) {");
                visitScope(ctx.scope());
                visitExpression(ctx.expression(1));

                generator.add("vpush(\"" + ctx.IDENT() + "\");");
                generator.add("vpush(1);");
                generator.add("plus();");
                generator.add("assign(\"" + ctx.IDENT() + "\");");
                generator.add("vpush(\"" + ctx.IDENT() + "\");");
                generator.add("lessequal();");
                generator.add("}");
                generator.add("enterScope();");

                break;
            case "loop":
                // for 1..10 loop %scope% end
                //TODO implement
                break;
            default:
                // for i in loop %scope% end
                //TODO implement
                break;
        }
//        return visitChildren(ctx);
        return null;
    }

    @Override
    public T visitPrint(DParser.PrintContext ctx) {

        for (DParser.ExpressionContext expr : ctx.expression()) {
            visitExpression(expr);
            generator.add("cprint();");
        }
        return null;
//        return visitChildren(ctx);
    }

    @Override
    public T visitR_return(DParser.R_returnContext ctx) {

        visitExpression(ctx.expression());
        generator.add("exitfunc();");
        generator.add("if (true) {return;}");
        return null;
    }

    @Override
    public T visitAssignment(DParser.AssignmentContext ctx) {
        visitExpression(ctx.expression());
        visitReferenceFromAssignment(ctx.reference());
        return null;
    }

    @Override
    public T visitDeclaration(DParser.DeclarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitVar_definition(DParser.Var_definitionContext ctx) {

        generator.add("add(\"" + ctx.IDENT() + "\");");

        if (ctx.expression() != null) {

            visitExpression(ctx.expression());
            generator.add("assign(\"" + ctx.IDENT() + "\");");
        }
        return null;
    }

    @Override
    public T visitReference(DParser.ReferenceContext ctx) {

        // Just IDENT, rule 1
        if (ctx.getChildCount() == 1) {
            generator.add("vpush(\"" + ctx.IDENT() + "\");");
        } else {
            String elem = ctx.getChild(1).getText();

            switch (elem) {
                case "[":
                    visitReference(ctx.reference());
                    visitExpression(ctx.expression(0));
                    generator.add("readcort();");
                    break;
                case "(":
                    for (DParser.ExpressionContext expr : ctx.expression()) {
                        visitExpression(expr);
                    }
                    visitReference(ctx.reference());
                    generator.add("invoke();");
                    break;
                case ".":
                    visitReference(ctx.reference());
                    visitExpression(ctx.expression(0));
                    generator.add("readobj();");
                    break;
            }
        }

        return null;
//        return visitChildren(ctx);
    }

    public T visitReferenceFromAssignment(DParser.ReferenceContext ctx) {

        // Just IDENT, rule 1
        if (ctx.getChildCount() == 1) {
            generator.add("assign(\"" + ctx.IDENT() + "\");");
        } else {
            String elem = ctx.getChild(1).getText();

            switch (elem) {
                case "[":
                    visitReference(ctx.reference());
                    generator.add("swap();");
                    visitExpression(ctx.expression(0));
                    generator.add("swap();");
                    generator.add("assigncort();");
                    break;
                case ".":
                    break;
            }
        }
        return null;
    }

    @Override
    public T visitExpression(DParser.ExpressionContext ctx) {

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
                        generator.add("or();");
                        break;
                    case "and":
                        generator.add("and();");
                        break;
                    case "xor":
                        generator.add("xor();");
                        break;
                }
            }

        }
        return null;
    }

    @Override
    public T visitRelation(DParser.RelationContext ctx) {
        // the relation is " X op Y"
        if (ctx.children.size() == 3) {
            visitSimple((DParser.SimpleContext) ctx.children.get(2));
            visitSimple((DParser.SimpleContext) ctx.children.get(0));

            switch (ctx.children.get(1).getText()) {
                case ">":
                    generator.add("greater();");
                    break;
                case ">=":
                    generator.add("moreequal()");
                    break;
                case "<":
                    generator.add("less();");
                    break;
                case "<=":
                    generator.add("lessequal();");
                    break;
                case "=":
                    generator.add("equals();");
                    break;
                case "/=":
                    generator.add("notequal();");
                    break;
            }
        } else {
            visitChildren(ctx);
        }
        return null;
    }

    @Override
    public T visitSimple(DParser.SimpleContext ctx) {

        if (ctx.getChildCount() == 1) {
            // No math operatoin
            visitChildren(ctx);
        } else {
            for (int i = ctx.summand().size() - 1; i >= 0; i--) {
                visitSummand(ctx.summand(i));
            }


            for (int i = 1; i < ctx.getChildCount(); i = i + 2) {
                switch (ctx.getChild(i).getText()) {
                    case "+":
                        generator.add("plus();");
                        break;
                    case "-":
                        generator.add("minus();");
                        break;
                }
            }

        }
        return null;
    }

    @Override
    public T visitSummand(DParser.SummandContext ctx) {


        if (ctx.getChildCount() == 1) {
            // No math operatoin
            visitChildren(ctx);
        } else {
            // mathematical operation
            for (int i = ctx.factor().size() - 1; i >= 0; i--) {
                visitFactor(ctx.factor(i));
            }

            for (int i = 1; i < ctx.getChildCount(); i = i + 2) {
                switch (ctx.getChild(i).getText()) {
                    case "*":
                        generator.add("multiply();");
                        break;
                    case "/":
                        generator.add("divide();");
                        break;
                }
            }
        }
        return null;
    }

    @Override
    public T visitFactor(DParser.FactorContext ctx) {
        if (ctx.children.get(0).getText().equals("+") ||
                ctx.children.get(0).getText().equals("-") ||
                ctx.children.get(0).getText().equals("not")) {

            visitChildren(ctx);

            switch (ctx.children.get(0).getText()) {
                case "+":
                    break;
                case "-":
                    generator.add("vpush(-1);");
                    generator.add("multiply();");
                    break;
                case "not":
                    break;
            }
        } else {
            visitChildren(ctx);
        }
        return null;
    }

    @Override
    public T visitPrimary(DParser.PrimaryContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitFunction_literal(DParser.Function_literalContext ctx) {
        generator.add("vpush(new Function(() -> {");
        visitScopeFromFunction(ctx.body().scope(), ctx.IDENT());
        generator.add("}));");
        return null;
    }

    @Override
    public T visitBody(DParser.BodyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitType_indicator(DParser.Type_indicatorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitLiteral(DParser.LiteralContext ctx) {


        if (ctx.STRING() != null) {
            generator.add("vpush( new Text(" + ctx.getChild(0).getText() + "));");
        } else if (ctx.tuple() != null || ctx.object() != null) {
            return visitChildren(ctx);
        } else {
            generator.add("vpush(" + ctx.getChild(0).getText() + ");");
        }
        return null;
    }

    @Override
    public T visitObject(DParser.ObjectContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitTuple(DParser.TupleContext ctx) {
        generator.add("vpush(new Cortaige());");
        for (int i = 1; i <= ctx.expression().size(); i++) {
            generator.add("dup();");
            visitExpression(ctx.expression(i - 1));
            generator.add("vpush(" + i + ");");
            generator.add("assigncort();");
        }
        return null;
    }
}
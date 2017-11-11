package compiler.antlr;

import compiler.codegen.CodeGenerator;
import org.runtime.CommonTokenStream;
import org.runtime.tree.AbstractParseTreeVisitor;
import org.runtime.tree.TerminalNode;

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

    @Override
    public T visitCompilation_unit(DParser.Compilation_unitContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitProgram(DParser.ProgramContext ctx) {
        System.out.println("scopeStack.newScope();");
        visitScopeNoNewScope(ctx.scope());
        System.out.println("scopeStack.popScope();");
        return null;
    }

    @Override
    public T visitScope(DParser.ScopeContext ctx) {
        System.out.println("enterScope();");
        visitChildren(ctx);
        System.out.println("exitScope();");
        return null;
    }

    public T visitScopeNoNewScope(DParser.ScopeContext ctx) {
        return visitChildren(ctx);
    }

    public T visitScopeFromFunction(DParser.ScopeContext ctx, List<TerminalNode> args) {
        //TODO check order
        for (int i = args.size() - 1; i >= 0; i--) {
            System.out.println("add(\"" + args.get(i).getSymbol().getText() + "\");");
            System.out.println("assign(\"" + args.get(i).getSymbol().getText() + "\");");
        }
        visitChildren(ctx);
        return null;
    }

    @Override
    public T visitStatement(DParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitR_if(DParser.R_ifContext ctx) {

        if (ctx.getChildCount() == 5) {
            // if without else
        } else {
            // if with else
            visitExpression((DParser.ExpressionContext) ctx.getChild(1));
            System.out.println("if(bpop()) {");
            visitScope((DParser.ScopeContext) ctx.getChild(3));
            System.out.println("} else {");
            visitScope((DParser.ScopeContext) ctx.getChild(5));
            System.out.println("}");
        }
        return null;
//        return visitChildren(ctx);
    }

    @Override
    public T visitR_while(DParser.R_whileContext ctx) {

        visitExpression(ctx.expression());
        System.out.println("while(bpop()) {");
        visitScope(ctx.scope());
        visitExpression(ctx.expression());
        System.out.println("}");

        return null;
//        return visitChildren(ctx);
    }

    @Override
    public T visitR_for(DParser.R_forContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitPrint(DParser.PrintContext ctx) {

        for (DParser.ExpressionContext expr : ctx.expression()) {
            visitExpression(expr);
            System.out.println("cprint();");
        }
        return null;
//        return visitChildren(ctx);
    }

    @Override
    public T visitR_return(DParser.R_returnContext ctx) {
        return visitChildren(ctx);
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

        System.out.println("add(\"" + ctx.IDENT() + "\");");

        if (ctx.expression() != null) {

            visitExpression(ctx.expression());
            System.out.println("assign(\"" + ctx.IDENT() + "\");");
        }
        return null;
    }

    @Override
    public T visitReference(DParser.ReferenceContext ctx) {
        // Just IDENT, rule 1
        if (ctx.getChildCount() == 1) {
            System.out.println("vpush(\"" + ctx.IDENT() + "\");");
        } else {
            String elem = ctx.getChild(1).getText();

            switch (elem) {
                case "[":
                    visitReference(ctx.reference());
                    visitExpression(ctx.expression(0));
                    System.out.println("readcort();");
                    break;
                case "(":
                    for (DParser.ExpressionContext expr : ctx.expression()) {
                        visitExpression(expr);
                    }
                    visitReference(ctx.reference());
                    System.out.println("invoke();");
                    break;
                case ".":
                    break;
            }
        }

        return null;
//        return visitChildren(ctx);
    }

    public T visitReferenceFromAssignment(DParser.ReferenceContext ctx) {

        // Just IDENT, rule 1
        if (ctx.getChildCount() == 1) {
            System.out.println("assign(\"" + ctx.IDENT() + "\");");
        } else {
            String elem = ctx.getChild(1).getText();

            switch (elem) {
                case "[":
                    visitReference(ctx.reference());
                    System.out.println("swap();");
                    visitExpression(ctx.expression(0));
                    System.out.println("swap();");
                    System.out.println("assigncort();");
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
                        System.out.println("or();");
                        break;
                    case "and":
                        System.out.println("and();");
                        break;
                    case "xor":
                        System.out.println("xor();");
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

            //TODO this switch is uncomplete, complete it
            switch (ctx.children.get(1).getText()) {
                case ">":
                    System.out.println("greater();");
                    break;
                case "/=":
                    System.out.println("notequal();");
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
                        System.out.println("plus();");
                        break;
                    case "-":
                        System.out.println("minus();");
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
                        System.out.println("multiply();");
                        break;
                    case "/":
                        System.out.println("divide();");
                        break;
                }
            }
        }
        return null;
    }

    @Override
    public T visitFactor(DParser.FactorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitPrimary(DParser.PrimaryContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitFunction_literal(DParser.Function_literalContext ctx) {

        System.out.println("vpush(new Function(() -> {");
        visitScopeFromFunction(ctx.body().scope(), ctx.IDENT());
        System.out.println("}));");
//        return visitChildren(ctx);
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

        if (ctx.INTEGER() != null) {
            System.out.println("vpush(" + ctx.getChild(0).getText() + ");");
        }
        return visitChildren(ctx);
    }

    @Override
    public T visitObject(DParser.ObjectContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitTuple(DParser.TupleContext ctx) {
        System.out.println("vpush(new Cortaige());");

        for (int i = 1; i <= ctx.expression().size(); i++) {
            System.out.println("dup();");
            visitExpression(ctx.expression(i - 1));
            System.out.println("vpush(" + i + ");");
            System.out.println("assigncort();");
        }
        return null;
    }
}
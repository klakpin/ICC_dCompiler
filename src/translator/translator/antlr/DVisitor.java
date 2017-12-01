// Generated from /home/ilya/Documents/Compilers/Compiler project/src/translator/translator/antlr/D.g4 by ANTLR 4.7
package translator.antlr;

import translator.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DParser#compilation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitCompilation_unit(DParser.Compilation_unitContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitProgram(DParser.ProgramContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitScope(DParser.ScopeContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitStatement(DParser.StatementContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitInvocation(DParser.InvocationContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#r_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitR_if(DParser.R_ifContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#r_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitR_while(DParser.R_whileContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#r_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitR_for(DParser.R_forContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitPrint(DParser.PrintContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#r_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitR_return(DParser.R_returnContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitAssignment(DParser.AssignmentContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitDeclaration(DParser.DeclarationContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#var_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitVar_definition(DParser.Var_definitionContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitReference(DParser.ReferenceContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitExpression(DParser.ExpressionContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitRelation(DParser.RelationContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitSimple(DParser.SimpleContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#summand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitSummand(DParser.SummandContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitFactor(DParser.FactorContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitPrimary(DParser.PrimaryContext ctx) throws Exception;

    /**
     * Visit a parse tree produced by {@link DParser#readInt}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReadInt(DParser.ReadIntContext ctx);

    /**
     * Visit a parse tree produced by {@link DParser#readReal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReadReal(DParser.ReadRealContext ctx);

    /**
     * Visit a parse tree produced by {@link DParser#readString}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReadString(DParser.ReadStringContext ctx);

    /**
     * Visit a parse tree produced by {@link DParser#function_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitFunction_literal(DParser.Function_literalContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitBody(DParser.BodyContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#type_indicator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_indicator(DParser.Type_indicatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitLiteral(DParser.LiteralContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitObject(DParser.ObjectContext ctx) throws Exception;

    /**
	 * Visit a parse tree produced by {@link DParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitTuple(DParser.TupleContext ctx) throws Exception;
}
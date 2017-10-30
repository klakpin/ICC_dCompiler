// Generated from /home/ilya/Documents/Compilers/Compiler project/src/grammar/D.g4 by ANTLR 4.7
package grammar;

import org.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DParser}.
 */
public interface DListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link DParser#compilation_unit}.
     *
     * @param ctx the parse tree
     */
    void enterCompilation_unit(DParser.Compilation_unitContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#compilation_unit}.
     *
     * @param ctx the parse tree
     */
    void exitCompilation_unit(DParser.Compilation_unitContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#program}.
     *
     * @param ctx the parse tree
     */
    void enterProgram(DParser.ProgramContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#program}.
     *
     * @param ctx the parse tree
     */
    void exitProgram(DParser.ProgramContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#scope}.
     *
     * @param ctx the parse tree
     */
    void enterScope(DParser.ScopeContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#scope}.
     *
     * @param ctx the parse tree
     */
    void exitScope(DParser.ScopeContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(DParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(DParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#r_if}.
     *
     * @param ctx the parse tree
     */
    void enterR_if(DParser.R_ifContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#r_if}.
     *
     * @param ctx the parse tree
     */
    void exitR_if(DParser.R_ifContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#r_while}.
     *
     * @param ctx the parse tree
     */
    void enterR_while(DParser.R_whileContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#r_while}.
     *
     * @param ctx the parse tree
     */
    void exitR_while(DParser.R_whileContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#r_for}.
     *
     * @param ctx the parse tree
     */
    void enterR_for(DParser.R_forContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#r_for}.
     *
     * @param ctx the parse tree
     */
    void exitR_for(DParser.R_forContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#print}.
     *
     * @param ctx the parse tree
     */
    void enterPrint(DParser.PrintContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#print}.
     *
     * @param ctx the parse tree
     */
    void exitPrint(DParser.PrintContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#r_return}.
     *
     * @param ctx the parse tree
     */
    void enterR_return(DParser.R_returnContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#r_return}.
     *
     * @param ctx the parse tree
     */
    void exitR_return(DParser.R_returnContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void enterAssignment(DParser.AssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void exitAssignment(DParser.AssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#declaration}.
     *
     * @param ctx the parse tree
     */
    void enterDeclaration(DParser.DeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#declaration}.
     *
     * @param ctx the parse tree
     */
    void exitDeclaration(DParser.DeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#var_definition}.
     *
     * @param ctx the parse tree
     */
    void enterVar_definition(DParser.Var_definitionContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#var_definition}.
     *
     * @param ctx the parse tree
     */
    void exitVar_definition(DParser.Var_definitionContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#reference}.
     *
     * @param ctx the parse tree
     */
    void enterReference(DParser.ReferenceContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#reference}.
     *
     * @param ctx the parse tree
     */
    void exitReference(DParser.ReferenceContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterExpression(DParser.ExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitExpression(DParser.ExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#relation}.
     *
     * @param ctx the parse tree
     */
    void enterRelation(DParser.RelationContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#relation}.
     *
     * @param ctx the parse tree
     */
    void exitRelation(DParser.RelationContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#simple}.
     *
     * @param ctx the parse tree
     */
    void enterSimple(DParser.SimpleContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#simple}.
     *
     * @param ctx the parse tree
     */
    void exitSimple(DParser.SimpleContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#summand}.
     *
     * @param ctx the parse tree
     */
    void enterSummand(DParser.SummandContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#summand}.
     *
     * @param ctx the parse tree
     */
    void exitSummand(DParser.SummandContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#factor}.
     *
     * @param ctx the parse tree
     */
    void enterFactor(DParser.FactorContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#factor}.
     *
     * @param ctx the parse tree
     */
    void exitFactor(DParser.FactorContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#primary}.
     *
     * @param ctx the parse tree
     */
    void enterPrimary(DParser.PrimaryContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#primary}.
     *
     * @param ctx the parse tree
     */
    void exitPrimary(DParser.PrimaryContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#function_literal}.
     *
     * @param ctx the parse tree
     */
    void enterFunction_literal(DParser.Function_literalContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#function_literal}.
     *
     * @param ctx the parse tree
     */
    void exitFunction_literal(DParser.Function_literalContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#body}.
     *
     * @param ctx the parse tree
     */
    void enterBody(DParser.BodyContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#body}.
     *
     * @param ctx the parse tree
     */
    void exitBody(DParser.BodyContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#type_indicator}.
     *
     * @param ctx the parse tree
     */
    void enterType_indicator(DParser.Type_indicatorContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#type_indicator}.
     *
     * @param ctx the parse tree
     */
    void exitType_indicator(DParser.Type_indicatorContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#literal}.
     *
     * @param ctx the parse tree
     */
    void enterLiteral(DParser.LiteralContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#literal}.
     *
     * @param ctx the parse tree
     */
    void exitLiteral(DParser.LiteralContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#object}.
     *
     * @param ctx the parse tree
     */
    void enterObject(DParser.ObjectContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#object}.
     *
     * @param ctx the parse tree
     */
    void exitObject(DParser.ObjectContext ctx);

    /**
     * Enter a parse tree produced by {@link DParser#tuple}.
     *
     * @param ctx the parse tree
     */
    void enterTuple(DParser.TupleContext ctx);

    /**
     * Exit a parse tree produced by {@link DParser#tuple}.
     *
     * @param ctx the parse tree
     */
    void exitTuple(DParser.TupleContext ctx);
}
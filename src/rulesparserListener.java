// Generated from rulesparser.g4 by ANTLR 4.10.1

	import ASTPack.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rulesparserParser}.
 */
public interface rulesparserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(rulesparserParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(rulesparserParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(rulesparserParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(rulesparserParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(rulesparserParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(rulesparserParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(rulesparserParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(rulesparserParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(rulesparserParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(rulesparserParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#parameterTail}.
	 * @param ctx the parse tree
	 */
	void enterParameterTail(rulesparserParser.ParameterTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#parameterTail}.
	 * @param ctx the parse tree
	 */
	void exitParameterTail(rulesparserParser.ParameterTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(rulesparserParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(rulesparserParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(rulesparserParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(rulesparserParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(rulesparserParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(rulesparserParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(rulesparserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(rulesparserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(rulesparserParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(rulesparserParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(rulesparserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(rulesparserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(rulesparserParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(rulesparserParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(rulesparserParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(rulesparserParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(rulesparserParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(rulesparserParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(rulesparserParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(rulesparserParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(rulesparserParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(rulesparserParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(rulesparserParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(rulesparserParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(rulesparserParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(rulesparserParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(rulesparserParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(rulesparserParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(rulesparserParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(rulesparserParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(rulesparserParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(rulesparserParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(rulesparserParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(rulesparserParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(rulesparserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(rulesparserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(rulesparserParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(rulesparserParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(rulesparserParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(rulesparserParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(rulesparserParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(rulesparserParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(rulesparserParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(rulesparserParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(rulesparserParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(rulesparserParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#argumentTail}.
	 * @param ctx the parse tree
	 */
	void enterArgumentTail(rulesparserParser.ArgumentTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#argumentTail}.
	 * @param ctx the parse tree
	 */
	void exitArgumentTail(rulesparserParser.ArgumentTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(rulesparserParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(rulesparserParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(rulesparserParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(rulesparserParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(rulesparserParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(rulesparserParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(rulesparserParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(rulesparserParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#classMembers}.
	 * @param ctx the parse tree
	 */
	void enterClassMembers(rulesparserParser.ClassMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#classMembers}.
	 * @param ctx the parse tree
	 */
	void exitClassMembers(rulesparserParser.ClassMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(rulesparserParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(rulesparserParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#accessSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessSpecifier(rulesparserParser.AccessSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#accessSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessSpecifier(rulesparserParser.AccessSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(rulesparserParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(rulesparserParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#functionDeclaration1}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration1(rulesparserParser.FunctionDeclaration1Context ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#functionDeclaration1}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration1(rulesparserParser.FunctionDeclaration1Context ctx);
	/**
	 * Enter a parse tree produced by {@link rulesparserParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(rulesparserParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesparserParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(rulesparserParser.TypeSpecifierContext ctx);
}
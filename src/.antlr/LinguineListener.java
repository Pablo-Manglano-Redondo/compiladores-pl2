// Generated from /home/ssierra/uah/compiladores-pl2/src/Linguine.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LinguineParser}.
 */
public interface LinguineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LinguineParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LinguineParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LinguineParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LinguineParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LinguineParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LinguineParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LinguineParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(LinguineParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(LinguineParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#matchCases}.
	 * @param ctx the parse tree
	 */
	void enterMatchCases(LinguineParser.MatchCasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#matchCases}.
	 * @param ctx the parse tree
	 */
	void exitMatchCases(LinguineParser.MatchCasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#matchCase}.
	 * @param ctx the parse tree
	 */
	void enterMatchCase(LinguineParser.MatchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#matchCase}.
	 * @param ctx the parse tree
	 */
	void exitMatchCase(LinguineParser.MatchCaseContext ctx);
}
// Generated from /home/ssierra/uah/compiladores-pl2/src/SQLMini.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLMiniParser}.
 */
public interface SQLMiniListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLMiniParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SQLMiniParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMiniParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SQLMiniParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMiniParser#orderDirection}.
	 * @param ctx the parse tree
	 */
	void enterOrderDirection(SQLMiniParser.OrderDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMiniParser#orderDirection}.
	 * @param ctx the parse tree
	 */
	void exitOrderDirection(SQLMiniParser.OrderDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMiniParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SQLMiniParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMiniParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SQLMiniParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMiniParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SQLMiniParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMiniParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SQLMiniParser.ExpressionContext ctx);
}
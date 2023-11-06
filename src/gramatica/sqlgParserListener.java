// Generated from ./sqlgParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sqlgParser}.
 */
public interface sqlgParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sqlgParser#fichero}.
	 * @param ctx the parse tree
	 */
	void enterFichero(sqlgParser.FicheroContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlgParser#fichero}.
	 * @param ctx the parse tree
	 */
	void exitFichero(sqlgParser.FicheroContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlgParser#consulta}.
	 * @param ctx the parse tree
	 */
	void enterConsulta(sqlgParser.ConsultaContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlgParser#consulta}.
	 * @param ctx the parse tree
	 */
	void exitConsulta(sqlgParser.ConsultaContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlgParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(sqlgParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlgParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(sqlgParser.ExprContext ctx);
}
// Generated from w:/Apps/antlr/gramaticas/elementos.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link elementosParser}.
 */
public interface elementosListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link elementosParser#llamadafuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadafuncion(elementosParser.LlamadafuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link elementosParser#llamadafuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadafuncion(elementosParser.LlamadafuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link elementosParser#numeros}.
	 * @param ctx the parse tree
	 */
	void enterNumeros(elementosParser.NumerosContext ctx);
	/**
	 * Exit a parse tree produced by {@link elementosParser#numeros}.
	 * @param ctx the parse tree
	 */
	void exitNumeros(elementosParser.NumerosContext ctx);
}
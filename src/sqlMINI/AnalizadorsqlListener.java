import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;



public class AnalizadorsqlListener extends sqlgParserBaseListener{
    
    @Override 
    public void visitTerminal(TerminalNode node) { 
        //System.out.print(" " + node);
    }

    @Override
    public void enterConsulta(sqlgParser.ConsultaContext ctx){
       // System.out.println("Nodo de consulta");
        System.out.println(ctx.getText());
    }
    @Override
    public void enterExpr(sqlgParser.ExprContext ctx){
       // System.out.println("Nodo de expr");
        //System.out.println(ctx.getText());
    }
}

import org.antlr.v4.runtime.tree.TerminalNode;

public class AnalizadorsqlListener extends sqlgParserBaseListener {

    @Override
    public void visitTerminal(TerminalNode node) {
        //System.out.print(node);
    }
}

import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTree;

public class AnalizadorsqlListener extends sqlgParserBaseListener {

    @Override
    public void visitTerminal(TerminalNode node) {
        System.out.print(node);
    }
}

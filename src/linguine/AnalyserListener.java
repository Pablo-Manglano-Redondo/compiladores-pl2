import java.util.ArrayList;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class AnalyserListener extends LinguineParserBaseListener {


    protected ArrayList<String[]> symbolTable = new ArrayList<String[]>();

    @Override
    public void visitTerminal(TerminalNode node) {
        // System.out.print(node);
    }

    @Override
    public void enterAssignment(LinguineParser.AssignmentContext ctx) {


        if (ctx.getChildCount() > 2) {
            
            // for (int i = 0; i < ctx.getChildCount(); i++) {
            //     System.out.print(ctx.getChild(i) + "index: " + i + " | ");
            // }

            // Iterate through the children tree
            String[] assignment = new String[2];
            assignment[0] = ctx.getChild(0).getText();
            assignment[1] = ctx.getChild(2).getText();
            symbolTable.add(assignment);
        }
        
        
    }

    public void printSymbolTable() {

        for(String[] row : symbolTable) {
            System.out.println("@: " + row[0] + " --> " + row[1]);
        }

    }
        
}

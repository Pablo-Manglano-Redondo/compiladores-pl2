import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@SuppressWarnings("deprecation")
public class Analyser 
{
    public static void main( String[] args ) throws IOException
    {
        // Initialise data input stream

        String inputFile = null;
        if (args.length > 0) inputFile = args[0];

        InputStream is = System.in;

        if (inputFile != null) {
            try {
                is = new FileInputStream(inputFile);
            } catch (Exception e) {
                System.out.println("File not found");
            }
        }

        // Initialise ANTLR from file

        ANTLRInputStream input = new ANTLRInputStream(is);

        LinguineLexer lexer = new LinguineLexer(input);
        
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LinguineParser parser = new LinguineParser(tokens);

        ParseTree tree = parser.program(); // Parse the input




        if (args.length > 1 && (args[1].equals("-t") || args[1].equals("--tree"))) {

            System.out.println(tree.toStringTree(parser)); // Print LISP-style tree
        } else {


            
            // Traverse the tree
            // 1. Initialise the walker
            
        ParseTreeWalker walker = new ParseTreeWalker();

        // 2. Initialise listener
        
        AnalyserListener listener = new AnalyserListener();

        // 3. Walk the tree and fetch needed data.
        
        System.out.println("@: ID --> VAL");
        System.out.println("----------------");

        walker.walk(listener, tree);

        // 4. Print symbol table

        listener.printSymbolTable();
        
        }
    }
}


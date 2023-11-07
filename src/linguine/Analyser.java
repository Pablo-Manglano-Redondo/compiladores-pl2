import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class Analyser 
{
    public static void main( String[] args )
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
        LinguineParser parser = LinguineParser(tokens);

        ParseTree tree = parser.program(); // Parse the input

        System.out.println(tree.toStringTree(parser)); // Print LISP-style tree
        

    }
}


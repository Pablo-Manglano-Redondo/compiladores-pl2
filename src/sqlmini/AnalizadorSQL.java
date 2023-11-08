import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

@SuppressWarnings("deprecation")
public class AnalizadorSQL {

    public static void main(String[] args) throws Exception{

        String inputFile = null;
        if(args.length>0) inputFile = args[0];

        InputStream is = System.in;
        if(inputFile!=null) is = new FileInputStream(inputFile);

        
        ANTLRInputStream input = new ANTLRInputStream(is);

        sqlgLexer lexer = new sqlgLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        sqlgParser parser = new sqlgParser(tokens);

        ParseTree tree = parser.fichero();

        ParseTreeWalker walker = new ParseTreeWalker();
        AnalizadorsqlListener escuchador = new AnalizadorsqlListener();
        walker.walk(escuchador,tree);

        System.out.println(tree.toStringTree(parser));
    }
}

import org.antlr.runtime.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


public class Main {
    public static void main(String[] args) throws IOException,RecognitionException {
        
        String whileClassContent = "function not : read Op1 % if Op1 then Result := (false) else Result := (true) fi % write Result";

        CharStream input = new ANTLRStringStream(whileClassContent);
        whileLexer lexer = new whileLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        System.out.println("hey");
        whileParser parser = new whileParser(tokens);
        System.out.println("hey?");
        
        // Obtention de l'arbre syntaxique
        whileParser.program_return result = parser.program();
        Tree ast = (Tree) result.getTree();

        System.out.println(ast.getChild(0).getChild(0));
    }
}

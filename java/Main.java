import org.antlr.runtime.*;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import org.antlr.runtime.tree.*;
import noeuds.*;

public class Main {
    public static void main(String[] args) throws IOException,RecognitionException {
        
        String whileClassContent = "function not : read Op1 % if Op1 then Result := (false) else Result := (true) fi % write Result";
        CharStream input = new ANTLRStringStream(whileClassContent);
        Grammar3Lexer lexer = new Grammar3Lexer(input); // Lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer); // Tokens
        Grammar3Parser parser = new Grammar3Parser(tokens); // Parser
        
        // Obtention de l'AST
        Grammar3Parser.program_return result = parser.program();
        Tree ast = (Tree) result.getTree();

        // Affichage de la table des symboles correspondante
        TableSymbole t = new TableSymbole(ast) ;
        System.out.println(t);

        List<String> current = new ArrayList<String>();
        // Affiche les resultats de la compilation

        Compilation.compile(ast, current);
        
        System.out.println("--------- Résultats compilation ---------\n" +current);

        // Voir CommonTree (Qui ramene le code 3 adresses)

        System.out.println("--------- Code 3 adresses ---------");
        List<String> lists = Compilation.compile(ast);
        for (String addrs : lists) {
            System.out.println(addrs);
        }

    }
}

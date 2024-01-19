package noeuds ;
import org.antlr.runtime.tree.Tree;
import java.util.LinkedList;
import java.util.List;

public class Function {

    private static LinkedList<String> getOutput(Tree tree) {
        if (tree.getType() != Grammar3Lexer.OUTPUTS) {
            throw new RuntimeException("Nœud OUTPUTS attendu");
        }
        LinkedList<String> resultats = new LinkedList<>();
        List<Tree> outputs = Compilation.getChildren(tree);
        for (Tree output : outputs) {
            resultats.add(output.getText());
        }
        return resultats;
    }

    private static LinkedList<String> getInput(Tree tree) {
        if (tree.getType() != Grammar3Lexer.INPUTS) {

            throw new RuntimeException("Nœud INPUTS ");
        }
        LinkedList<String> resultats = new LinkedList<>();
        List<Tree> inputs = Compilation.getChildren(tree);
        for (Tree input : inputs) {
            String inputText = input.getText();
            resultats.add(inputText);
        }
        return resultats;
    }

    public static void generation_code(List<String> result, Tree tree) {
        String nom = tree.getChild(0).getText();
        Tree inputs = tree.getChild(1);
        LinkedList<String> entree = getInput(inputs);
        Tree output = tree.getChild(3);
        LinkedList<String> sorti= getOutput(output);
        Tree elments = tree.getChild(2);

        result.add("Debut fonction"+" "+nom);

        for (String in : entree) {
            result.add("get " + in);
        }

        Compilation.compile(elments, result);

        for (String out : sorti) {
            result.add("return " + out);
        }

        result.add("Return");
        result.add("Fin fonction"+" "+nom);
    }
}



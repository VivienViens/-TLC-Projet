package noeuds ;
import org.antlr.runtime.tree.Tree;

import java.util.List;

public class While {
    /**
     * Génère le code correspondant à une instruction "while" (boucle tant que).
     *
     * @param result Liste pour stocker le code généré.
     * @param tree   Arbre représentant l'instruction "while".
     * @param index  Index utilisé pour identifier cette instruction "while".
     */
    public static void genereCode(List<String> result, Tree tree, int index) {
        Tree expressions = tree.getChild(0);
        Tree commands = tree.getChild(1);

        // Générer du code pour l'expression
        Expression exp = new Expression(expressions);
        Expression.Generation expResult = exp.genereCode();

        // Générer du code pour les commandes à l'intérieur du "while"
        List<String> commandInter = Compilation.compile(commands);

        // Générer du code pour le "while"
        result.addAll(expResult.code);
        result.add("WHILE_BEFORE_COND_" + index + ":");

        // Si l'expression est fausse, sauter à la fin du "while"
        result.add("if " + expResult.valeur + " goto WHILE_AFTER_WHILE_" + index);

        // Si l'expression est vraie, exécuter les commandes à l'intérieur du "while"
        result.addAll(commandInter);

        // Sauter au début du "while"
        result.add("goto WHILE_BEFORE_CONDITION_" + index);

        // Étiquette marquant la fin du "while"
        result.add("END_WHILE" + index + ":");
    }
}



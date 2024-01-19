package noeuds ;
import org.antlr.runtime.tree.Tree;

import java.util.List;
public class If {

    public static void genereCode(List<String> result, Tree tree, int index) {
        Tree conditions = tree.getChild(0);
        Tree brancheOk = tree.getChild(1);
        Tree branchSinon = tree.getChild(2);

        Expression conditionsExpress = new Expression(conditions);
        Expression.Generation compose = conditionsExpress.genereCode();
        result.addAll(compose.code);

        // Génération du saut conditionnel
        result.add("if " + compose.valeur + " goto FALSE_LABEL_" + index);

        // Génération du code pour la branche
        Compilation.compile(brancheOk, result);

        // Si pas de branche "else", on ajoute simplement le label false
        if (branchSinon == null) {
            result.add("FALSE_LABEL_" + index + ":");
        } else {
            // Saut vers la fin de la structure conditionnelle
            result.add("goto FIN_LABEL" + index);

            // Label pour la partie "else"
            result.add("FALSE_LABEL_" + index + ":");

            // Génération du code pour la branche "else"
            Compilation.compile(branchSinon, result);

            // Label de fin
            result.add("FIN_LABEL" + index + ":");
        }
    }
}



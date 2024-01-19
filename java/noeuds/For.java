package noeuds ;
import org.antlr.runtime.tree.Tree;

import java.util.List;
public class For {

    public static void genereCode(List<String> resultats, Tree tree, int index) {
        // Récupérer les parties de la boucle for (variables et commandes)
        Tree variables = tree.getChild(0);
        Tree commands = tree.getChild(1);

        // Générer du code pour la variable de la boucle
        Expression variableExpress = new Expression(variables);
        Expression.Generation variableResultats = variableExpress.genereCode();
        resultats.addAll(variableResultats.code);

        resultats.add("FOR_VARIABLE_" + index + " = " + variableResultats.valeur);

        // code pour les commandes à l'intérieur de la boucle
        List<String> commandsCodeInter = Compilation.compile(commands);

        // code pour la boucle for
        resultats.add("FOR_BEFORE_CONDITION_" + index + ":");
        resultats.add("FOR_VARIABLE_CONDITION_" + index + " = FOR_VARIABLE_" + index + " <= 0");

        // Si la variable est fausse, sauter à la fin de la boucle for
        resultats.add("if FOR_VARIABLE_CONDITION_" + index + " goto FOR_AFTER_FOR_" + index);

        resultats.addAll(commandsCodeInter);

        // Décrémentation
        resultats.add("FOR_VARIABLE_" + index + " = FOR_VARIABLE_" + index + "[1]");

        // Saut au début de la boucle for
        resultats.add("goto FOR_BEFORE_CONDITION_" + index);

        // la fin de la boucle for
        resultats.add("FOR_AFTER_FOR_" + index + ":");
    }
}



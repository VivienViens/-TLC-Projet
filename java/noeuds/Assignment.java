package noeuds ;
import org.antlr.runtime.tree.Tree;

import java.util.List;


public class Assignment {

    public static void genereCode(List<String> result, Tree tree) {
        Tree mes_variables = tree.getChild(0);
        Tree expressionArbre = tree.getChild(1);
        String[] nvar = new String[mes_variables.getChildCount()];
        Tree[] ecriture_de_expression  = new Tree[expressionArbre.getChildCount()];

        // Récupération des noms de variables et des expressions associées
        for (int i = 0; i < nvar.length; i++) {
            nvar[i] = mes_variables.getChild(i).getText();
            ecriture_de_expression[i] = expressionArbre.getChild(i);
        }

        // Génération du code pour chaque déclaration de variable
        for (int i = 0; i < nvar.length; i++) {
            Expression expression = new Expression(ecriture_de_expression[i]);
            Expression.Generation compose = expression.genereCode();

            // Ajout du code préalable nécessaire pour l'expression
            result.addAll(compose.code);

            // Ajout de l'instruction de déclaration de variable
            result.add(nvar[i] + " = " + compose.valeur);
        }
    }
}



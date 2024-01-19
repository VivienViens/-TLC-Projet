package noeuds ;
import org.antlr.runtime.tree.Tree;
import java.util.LinkedList;
import java.util.List;

    //  Cette Classe est utilisée pour  représenter une expression du langage
    public class Expression   {

        // Arbre représentant la structure de l'expression
        private final Tree tree;

        // Constructeur
        public Expression(Tree tree) {
            this.tree = tree;
        }

        // Fonction principale pour générer le code correspondant à l'expression
        public Generation genereCode() {
            switch (tree.getType()) {
                // Si l'expression est une fonction (SYMBOLE)
                case Grammar3Parser.SYMB:
                    String nom = tree.getChild(0).getText();
                    LinkedList<String> argus = new LinkedList<>();
                    // Récupérer les arguments de la fonction
                    for (int i = 1; i < tree.getChildCount(); i++) {
                        argus.add(tree.getChild(i).getText());
                    }
                    LinkedList<String> elmt = new LinkedList<>();
                    // Générer le code pour les arguments
                    for (String argument : argus) {
                        elmt.add("param " + argument);
                    }
                    elmt.add("R" + counter + " = call " + nom + " " + argus.size());
                    elmt.add("R" + (counter + 1) + " = R" + counter + "[0]");
                    counter++;
                    Generation results = new Generation(elmt, "R" + counter);
                    counter++;
                    return results;

                // Si l'expression est une variable
                case Grammar3Parser.Variable:
                    return new Generation(List.of(), tree.getText());

                // Si l'expression est NIL
                case Grammar3Parser.NIL:
                    return new Generation(List.of(), "nil");

                // Si l'expression est une construction de liste (CONS)
                case Grammar3Parser.CONS:
                    switch (tree.getChildCount()) {
                        // Cas d'une liste vide
                        case 0:
                            return new Generation(List.of(), "nil");

                        // Cas d'un seul élément
                        case 1:
                            return new Generation(List.of(), tree.getChild(0).getText());

                        // Cas de deux éléments
                        case 2:
                            Expression first = new Expression(tree.getChild(0));
                            Expression second = new Expression(tree.getChild(1));
                            LinkedList<String> element = new LinkedList<>(first.genereCode().code);
                            element.addAll(second.genereCode().code);
                            element.add("R" + counter + "[0] = " + first.genereCode().valeur);
                            element.add("R" + counter + "[1] = " + second.genereCode().valeur);
                            Generation resultElemt = new Generation(element, "R" + counter);
                            counter++;
                            return resultElemt;

                        // Cas de plusieurs éléments
                        default:
                            LinkedList<String> elts = new LinkedList<>();
                            for (int comptEnfant = tree.getChildCount() - 1; comptEnfant >= 0; comptEnfant--) {
                                Expression express = new Expression(tree.getChild(comptEnfant));
                                Generation codeExpress = express.genereCode();
                                elts.addAll(codeExpress.code);
                                if (comptEnfant == tree.getChildCount() - 1) {
                                    elts.add("R" + counter + "[1] = " + codeExpress.valeur);
                                } else {
                                    elts.add("R" + counter + "[0] = " + codeExpress.valeur);
                                    if (comptEnfant != 0) {
                                        elts.add("R" + (counter + 1) + "[1] = R" + counter);
                                        counter++;
                                    }
                                }
                            }
                            Generation valeursResult = new Generation(elts, "R" + counter);
                            counter++;
                            return valeursResult;
                    }

                    // Si l'expression est l'opération TL (tête de liste)
                case Grammar3Parser.TL:
                    if (tree.getChild(0).getType() == Grammar3Parser.NIL) {
                        return new Generation(List.of(), "nil");
                    } else {
                        Expression tlExpres = new Expression(tree.getChild(0));
                        LinkedList<String> tlList = new LinkedList<>(tlExpres.genereCode().code);
                        tlList.add("param " + tlExpres.genereCode().valeur);
                        tlList.add("R" + counter + " = call tl 1");
                        tlList.add("R" + (counter + 1) + " = R" + counter + "[0]");
                        Generation tlResultats = new Generation(tlList, "R" + (counter + 1));
                        counter += 2;
                        return tlResultats;
                    }

                    // Si l'expression est l'opération HD (queue de liste)
                case Grammar3Parser.HD:
                    if (tree.getChild(0).getType() == Grammar3Parser.NIL) {
                        return new Generation(List.of(), "nil");
                    } else {
                        Expression hdExpress = new Expression(tree.getChild(0));
                        LinkedList<String> hdList = new LinkedList<>(hdExpress.genereCode().code);
                        hdList.add("param " + hdExpress.genereCode().valeur);
                        hdList.add("R" + counter + " = call hd 1");
                        hdList.add("R" + (counter + 1) + " = R" + counter + "[0]");
                        Generation hdResulats = new Generation(hdList, "R" + (counter + 1));
                        counter += 2;
                        return hdResulats;
                    }

                    // Si l'expression est une construction de liste (LIST)
                case Grammar3Parser.LIST:
                    switch (tree.getChildCount()) {
                        // Cas d'une liste vide
                        case 0:
                            return new Generation(List.of(), "nil");

                        // Cas d'un seul élément
                        case 1:
                            Expression listExpress = new Expression(tree.getChild(0));
                            LinkedList<String> listElmnt = new LinkedList<>(listExpress.genereCode().code);
                            listElmnt.add("R" + counter + "[0] = " + listExpress.genereCode().valeur);
                            listElmnt.add("R" + counter + "[1] = nil");
                            Generation resultList = new Generation(listElmnt, "R" + counter);
                            counter++;
                            return resultList;

                        // Cas de plusieurs éléments
                        default:
                            LinkedList<String> elmntMulti = new LinkedList<>();
                            for (int countEnfants = tree.getChildCount() - 1; countEnfants >= 0; countEnfants--) {
                                Expression listsExpress = new Expression(tree.getChild(countEnfants));
                                Generation codeListsExpress = listsExpress.genereCode();
                                elmntMulti.addAll(codeListsExpress.code);
                                if (countEnfants == tree.getChildCount() - 1) {
                                    elmntMulti.add("R" + counter + "[1] = nil");
                                    elmntMulti.add("R" + counter + "[0] = " + codeListsExpress.valeur);
                                } else {
                                    elmntMulti.add("R" + (counter + 1) + "[0] = " + codeListsExpress.valeur);
                                    elmntMulti.add("R" + (counter + 1) + "[1] = R" + counter);
                                    counter++;
                                }
                            }
                            Generation resultElmntMulti = new Generation(elmntMulti, "R" + counter);
                            counter++;
                            return resultElmntMulti;
                    }

                    // Si l'expression est un symbole
                case Grammar3Parser.Symbol:
                    return new Generation(List.of(), "\"" + tree.getText() + "\"");

                // Gérer les autres types d'expressions (non implémentés ici)
                default:
                    throw new RuntimeException("Non implementé: " + tree.getType());
            }
        }

        // Classe interne pour représenter le code généré par l'expression
        public static class Generation {
            public List<String> code;  // Code à préfixer avant l'expression
            public String valeur;          // Valeur résultante de l'expression

            // Constructeur prenant le code à préfixer et la valeur résultante
            public Generation(List<String> code, String valeur) {
                this.code = code;
                this.valeur = valeur;
            }
        }

        // Réinitialiser le compteur
        public static void reinitialisation() {
            counter = 0;
        }

        private static int counter = 0;
    }


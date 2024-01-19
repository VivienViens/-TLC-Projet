package noeuds ;
import org.antlr.runtime.tree.Tree;
import java.util.ArrayList;
import java.util.List;

    public class Compilation {
        private static int denombre_For = 0;
        private static int denombre_If = 0;
        private static int denombre_While = 0;


        //  compilation de notre AST
        public static List<String> compile(Tree tree) {
            List<String> resultat = new ArrayList<>();
            compile(tree, resultat);
            return resultat;
        }

        // Réinitialisation des compteurs pendant d'une nouvelle compilation
        public static void reinitialisation () {
            denombre_For= 0;
            denombre_If = 0;
            denombre_While= 0;

            Expression.reinitialisation();
        }

        // Fonction récursive pour compiler chaque nœud de l'AST
        public static void compile(Tree tree, List<String> current) {
            int ndType = tree.getType();
            switch (ndType) {
                // Si le nœud est un programme
                case Grammar3Lexer.PROGRAM:
                case Grammar3Lexer.COMMANDS:
                    List<Tree> enfants = getChildren(tree);
                    for (Tree child : enfants) {
                        compile(child, current);
                    }
                    break;
                //  le nœud est une fonction
                case Grammar3Lexer.FUNCTION:
                    Function.generation_code(current, tree);
                    break;
                //  le nœud est un "if"
                case Grammar3Lexer.IF:
                    If.genereCode(current, tree, denombre_If++);
                    break;
                // le nœud est une assignation "assignment"
                case Grammar3Lexer.LET:
                    Assignment.genereCode(current, tree);
                    break;
                //  le nœud est une boucle "for"
                case Grammar3Lexer.FOR:
                    For.genereCode(current, tree, denombre_For++);
                    break;
                case Grammar3Lexer.WHILE:
                    While.genereCode(current,tree,denombre_While++);
                    break;
                // Si le nœud est une instruction "nop" (aucune operation n'est faite)
                case Grammar3Lexer.NOP:
                    //   rien  n'est faire
                    break;
                //  lever d'exception pour un type qui ne repond pas à touts ce qui a été precité precedemment
                default:
                    throw new RuntimeException("Le Type du noeud  est Inconnu: " + ndType);
            }
        }

        //  récupération  des enfants d'un nœud de l'AST
        public static List<Tree> getChildren(Tree tree) {
            List<Tree> enfants = new ArrayList<>();
            int k = 0;
            while (true) {
                Tree enfant = tree.getChild(k);
                if (enfant == null) {
                    break;
                }
                enfants.add(enfant);
                k++;
            }
            return enfants;
        }

    }


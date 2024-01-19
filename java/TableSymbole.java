
import java.util.LinkedList;


import org.antlr.runtime.tree.Tree;

public class TableSymbole {
    private class Bloc {
        LinkedList<String> symboles ;
        LinkedList<Bloc> blocEnfants;
        Bloc blocParent;
        String ID ;

        public Bloc(Bloc blocParent, String ID) {
            this.blocParent = blocParent ;
            symboles = new LinkedList<String>();
            blocEnfants = new LinkedList<Bloc>();
            this.ID = ID ;
        }

        /**
         * Bloc racine
         */
        public Bloc(String ID) {
            blocEnfants = new LinkedList<Bloc>();
            symboles = new LinkedList<String>();
            blocParent = null ;
            this.ID = ID ;
        }

        public Bloc ajoutBlocEnfant() {
            Bloc enfant = new Bloc(this, ID + blocEnfants.size());
            blocEnfants.addLast(enfant);
            return enfant ;
        }

        public boolean contientSymbole(String symbole) {
            return symboles.contains(symbole);
        }

        public void ajouterSymbole(String symbole) {
            symboles.push(symbole);
        }


        @Override
        public String toString() {
            String res = "--- TABLE " + ID + " ---\n";
            for (String symbole : symboles) {
                res += symbole + " " ;
            }
            return res;
        }
    }

    private LinkedList<Bloc> pile ; // Pile contenant tout les Blocs
    private Bloc racine ; // Bloc le plus haut
    private Bloc current ; // Bloc qu'on analyse actuellement
    private Tree ast ; // Arbre analysé
    

    public TableSymbole(Tree ast) {
        racine = new Bloc("0") ;
        current = racine ;
        pile = new LinkedList<Bloc>();
        pile.push(racine);
        this.ast = ast ;
        construireTableRecursif(ast);
    }

    public boolean contientSymbole(String symbole) {
        for (Bloc b : pile) {
            if (b.contientSymbole(symbole)) return true ;
        }
        return false ;
    }


    private void construireTableRecursif(Tree t) {
        String nom = t.toString(); 

        if (nom == "INPUTS") {
            for (int cpt = 0 ; cpt < t.getChildCount() ; cpt++) {
                String symbole = t.getChild(cpt).toString() ;
                current.ajouterSymbole(symbole);
            }
        } else if (nom == "VARS") {
            String nom_symbole = t.getChild(0).toString() ;
            if (!current.contientSymbole(nom_symbole)) {
                current.ajouterSymbole(nom_symbole) ;
            }
            
        } else if (nom == "COMMANDS") {
            for (int cpt = 0 ; cpt < t.getChildCount() ; cpt++) {
                construireTableRecursif(t.getChild(cpt));
            }
        } else if (nom == "IF" || nom == "WHILE" || nom == "FOR" || nom == "FOREACH" || nom == "FUNCTION") {
            Bloc b = current.ajoutBlocEnfant();
            pile.push(b);
            current = b ;
            for (int cpt = 0 ; cpt < t.getChildCount() ; cpt++) {
                construireTableRecursif(t.getChild(cpt));
            }
            current = b ;
        } else if (t.getChildCount() != 0) {
            for (int cpt = 0 ; cpt < t.getChildCount() ; cpt++) {
                construireTableRecursif(t.getChild(cpt));
            }
        }
    }

    @Override
        public String toString() {
            String res = "=== TABLE DES SYMBOLES ===\n";
            for (Bloc b : pile) {
                res += b + "\n" ;
            }
            res += "==========================\n";
            return res;
        }
}

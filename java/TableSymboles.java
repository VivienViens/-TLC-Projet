import java.util.HashMap;
import java.util.LinkedList;

import org.antlr.runtime.tree.Tree;

public class TableSymboles {
    private LinkedList<HashMap> pile ;
    private Tree ast ;

    public TableSymboles(Tree ast) {
        pile = new LinkedList<HashMap>() ;
        this.ast = ast ;
        generer();
    }

    private void generer() {
        
    }
}

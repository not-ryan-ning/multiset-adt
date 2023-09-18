import java.util.ArrayList;
import java.util.Optional;

public class Tree {
    private Optional root;
    private ArrayList<Tree> subtrees;

    public Tree(Optional root, ArrayList<Tree> subtrees) {
        this.root = root;

        // not entirely sure if this is necessary - if the arraylist is empty in the initializer,
        if (subtrees.isEmpty()) {
            ArrayList<Tree> emptySubtrees = new ArrayList<>();
            this.subtrees = emptySubtrees;
        } else {
            this.subtrees = subtrees;
        }

    }



}



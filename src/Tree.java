import java.util.ArrayList;
import java.util.Optional;

public class Tree {
    private Object root;
    private ArrayList<Tree> subtrees;

    public Tree(Object root, ArrayList<Tree> subtrees) {
        this.root = root;

        if (subtrees.isEmpty()) {
            ArrayList<Tree> emptySubtrees = new ArrayList<>();
            this.subtrees = emptySubtrees;
        } else {
            this.subtrees = subtrees;
        }

    }

}



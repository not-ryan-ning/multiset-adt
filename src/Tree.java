import java.util.ArrayList;
import java.util.Optional;

public class Tree {
    private Object root;
    private ArrayList<Tree> subtrees;

    public Tree(Object root, ArrayList<Tree> subtrees) {
        this.root = root;

        if (subtrees.isEmpty()) {
            this.subtrees = new ArrayList<>();
        } else {
            this.subtrees = subtrees;
        }

    }

    private boolean isEmpty() {
        return this.subtrees.isEmpty();
    }

}



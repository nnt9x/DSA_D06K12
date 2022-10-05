package binary_search_tree;

public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root = null;

    public BinarySearchTree() {
    }

    public BinarySearchTree(Node<T> rootNode) {
        this.root = rootNode;
    }

    public void insert(T key) {
        root = insertKey(root, key);
    }

    // Insert key in the tree
    private Node<T> insertKey(Node<T> root, T key) {
        // Return a new node if the tree is empty
        if (root == null) {
            root = new Node<T>(key);
            return root;
        }
        // Traverse to the right place and insert the node
        if (key.compareTo(root.getValue()) < 0) {
            root.setLeft(insertKey(root.getLeft(), key));
        } else if (key.compareTo(root.getValue()) > 0) {
            root.setRight(insertKey(root.getRight(), key));
        }

        return root;
    }

}

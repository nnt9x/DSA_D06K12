package tree1;

public class BinaryTree {
    private Node rootNode;

    public BinaryTree(Node rootNode) {
        this.rootNode = rootNode;
    }

    public Node getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }

    public void inorder(Node node) {
        if (node == null)
            return;
        // Traverse left
        inorder(node.getLeft());
        // Traverse root
        System.out.print(node.getValue() + "->");
        // Traverse right
        inorder(node.getRight());
    }

    public void preorder(Node node) {
        if (node == null)
            return;

        // Traverse root
        System.out.print(node.getValue() + "->");
        // Traverse left
        preorder(node.getLeft());
        // Traverse right
        preorder(node.getRight());
    }

    public void postorder(Node node) {
        if (node == null)
            return;

        // Traverse left
        postorder(node.getLeft());
        // Traverse right
        postorder(node.getRight());
        // Traverse root
        System.out.print(node.getValue() + "->");
    }

}

package tree1;

public class Main {
    public static void main(String[] args) {

        // Khởi tạo cây với root node
        BinaryTree binaryTree = new BinaryTree(new Node(1));

        // Thêm các node
        binaryTree.getRootNode().setRight(new Node(9));
        binaryTree.getRootNode().setLeft(new Node(12));
        binaryTree.getRootNode().getLeft().setLeft(new Node(5));
        binaryTree.getRootNode().getLeft().setRight(new Node(6));

        binaryTree.inorder(binaryTree.getRootNode());
        System.out.println();
        binaryTree.preorder(binaryTree.getRootNode());
        System.out.println();
        binaryTree.postorder(binaryTree.getRootNode());

    }
}

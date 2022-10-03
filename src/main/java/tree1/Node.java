package tree1;


public class Node<T> {
    private T value;
    private Node left = null;
    private Node right = null;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node[" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                ']';
    }
}

package linkedList;

public interface LinkedList {
    // Khai báo các phép toán
    public void insertToBegin(Node node);

    public void insertAfter(Node prev_node, Node node);

    public void insertAtEnd(Node node);

    public void deleteNote(int position);

    public int getSize();

    public void printLinkedList();

}

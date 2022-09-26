package linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedListImpl();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        linkedList.insertToBegin(node1);
        linkedList.insertToBegin(node2);
        linkedList.insertToBegin(node3);
        linkedList.insertAtEnd(node4);
        // 3 2 1 4
        Node node5 = new Node(5);
        linkedList.insertAfter(node3, node5);

        System.out.println(linkedList.getSize());
        linkedList.printLinkedList();
        // Xoá node vi trí 2
        linkedList.deleteNote(1);
        linkedList.printLinkedList();

    }
}

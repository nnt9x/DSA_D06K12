package linkedList;

public class LinkedListImpl implements LinkedList {

    private Node head = null;

    // Phương thức khởi tao
    public LinkedListImpl() {
        super();
    }

    @Override
    public void insertToBegin(Node node) {
        // Tạo ra node mới từ dữ liệu được thêm
        node.setNext(head);
        head = node;
    }

    @Override
    public void insertAfter(Node prev_node, Node node) {
        // VD:   1  2  3
        // VD: insert node 4 -> vào sau node 3
        // node 2 có next node 4, và node 4 -> node 3
        //  1 -> 2 -> 4 -> 3
        if (prev_node.getNext() == null) {
            System.out.println("Không thể insert");
            return;
        }
        Node next = prev_node.getNext();
        prev_node.setNext(node);
        node.setNext(next);
    }

    @Override
    public void insertAtEnd(Node node) {
        // Tìm node cuối cùng trong list
        Node lastNode = head;
        while (true) {
            if (lastNode.getNext() == null) {
                break;
            }
            // Duyệt đến node tiếp
            lastNode = lastNode.getNext();
        }
        // Đã tìm được lastnode
        lastNode.setNext(node);
    }

    @Override
    public void deleteNote(int position) {
        // Danh sách phải có dữ liệu
        if (head == null) {
            System.out.println("Danh sách rỗng");
            return;
        }
        Node temp = head;
        // TH1: xoá đầu hàng -> cần khai báo lại head
        if (position == 0) {
            head = head.getNext();
            return;
        }
        // TH2: xoá 1 phần tử khác head
        // Ý tưởng: cần tìm vị trí Node tại position và tại position -1
        // SetNext (position -1) = getNext(position)
        // setNext(position) = NULL

        if (position >= getSize()) {
            System.out.println("Không có vị trí position đó");
            return;
        }
        // -> Có thể xoá
        Node preNode = head, currentNode = null;
        // Current là node cần xoá
        for (int i = 0; i <= position; i++) {
            currentNode = preNode.getNext();
        }
        // Có được pre, currentNode
        preNode.setNext(currentNode.getNext());
        currentNode.setNext(null);
    }

    @Override
    public int getSize() {
        // 0 nếu dánh sách rỗng
        if (head == null) {
            return 0;
        }
        Node node = head;
        int count = 1;
        while (true) {
            if (node.getNext() != null) {
                count++;
                node = node.getNext();
            } else {
                break;
            }
        }
        return count;
    }

    @Override
    public void printLinkedList() {
        // Kiểm tra xem node head có bằng null
        if (head == null) {
            System.out.println("Danh sách rỗng");
            return;
        }
        System.out.print("Giá trị của linked list: ");
        Node current = head;
        while (true) {
            long value = current.getValue();
            System.out.print("\t" + value);
            current = current.getNext();
            if (current == null) {
                break;
            }
        }
        System.out.println();
    }
}

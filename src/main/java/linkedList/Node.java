package linkedList;

// VD: tạo 1 danh sách lưu trữ số nguyên
//

public class Node {
    // Giá trị
    // Node tham chiếu tiếp theo
    private long value;
    private Node next;

    public Node(long value) {
        this.value = value;
    }

    public Node(long value, Node next) {
        this.value = value;
        this.next = next;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

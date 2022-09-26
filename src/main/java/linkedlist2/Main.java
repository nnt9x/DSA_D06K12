package linkedlist2;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        // Thêm dữ liệu vào linkedlist
        linkedList.add("hello");
        linkedList.addFirst("Hi");
        linkedList.addLast("BKACAD");
        // Kích thước
        System.out.println(linkedList.size());
        // list
        System.out.println(linkedList);

        String a = linkedList.get(2);
        System.out.println(a);

        // Xoá

    }
}

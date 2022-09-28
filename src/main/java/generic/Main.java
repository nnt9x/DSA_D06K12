package generic;

public class Main {
    public static void main(String[] args) {
        // Tạo 1 ngăn xếp chỉ chứa số nguyên
        MyStack<Integer> myStack = new MyStack<>(10);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.print();

        // Tạo 1 ngăn xếp chưa Message
        Message msg1 = new Message(1,"Hello");
        Message msg2 = new Message(2, "Welcome to Java");
        Notification notification1 = new Notification(1,"Notify 1","SYSTEM");

        MyStack<MyData> myStack1 = new MyStack<>(40);
        myStack1.push(msg2);
        myStack1.push(msg1);
        myStack1.push(notification1);

//        myStack1.pop();

        myStack1.print();


    }
}

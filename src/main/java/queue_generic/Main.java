package queue_generic;

public class Main {
    public static void main(String[] args) {
        QueueGeneric<String> stringQueueGeneric = new QueueGenericImpl<>(3);
        stringQueueGeneric.enqueue("Hello");
        stringQueueGeneric.enqueue("Hi");
        stringQueueGeneric.dequeue();
        stringQueueGeneric.enqueue("Welcome to DSA");
        stringQueueGeneric.enqueue("Hi");

        stringQueueGeneric.display();


    }
}

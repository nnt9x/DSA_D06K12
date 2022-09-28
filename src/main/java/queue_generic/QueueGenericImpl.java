package queue_generic;

import java.util.ArrayList;
import java.util.List;

public class QueueGenericImpl<T> implements QueueGeneric<T> {

    // Kích thước hàng đợi
    private int size;
    // lưu giá trị phần tử List
    private List<T> items;
    // vị trí đầu hàng và cuối
    private int front, rear;

    public QueueGenericImpl(int size) {
        this.size = size;
        front = rear = -1;
        items = new ArrayList<>();
    }

    @Override
    public void enqueue(T t) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        // Thêm vào cuối
        if (front == -1) {
            front = 0;
        }
        rear++;
        items.add(t);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        // Xoá phần tử cuối hàng?
        if (size() == 1) {
            front = rear = -1;
            return items.get(0);
        } else {
            // Size lớn hơn 1
            T item = items.get(front);
            if (front >= rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */ else {
                front++;
            }
            return item;
        }
    }

    @Override
    public boolean isEmpty() {
        return front == -1;
    }

    @Override
    public boolean isFull() {
        return size == size();
    }

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int i = front; i <= rear; i++) {
            count++;
        }
        return count;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        System.out.print("My queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print("\t" + items.get(i));
        }
        System.out.println();

    }
}

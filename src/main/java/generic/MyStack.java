package generic;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> implements Stack<T> {
    private final List<T> arr;
    private int top;
    private final int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        this.arr = new ArrayList<>();
        this.top = -1;
    }

    @Override
    public void push(T t) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr.add(t);
        }
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return arr.get(top);
    }

    @Override
    public T pop() {
        T tmp = arr.get(top);
        top--;
        return tmp;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top + 1 == capacity;
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("My stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print("\t" + arr.get(i));
        }
        System.out.println();
    }
}

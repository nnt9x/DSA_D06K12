package generic;

public interface Stack<T> {
    // Định nghĩa ra các phép toán
    public void push(T t);

    public T peek();

    public T pop();

    public boolean isEmpty();

    public boolean isFull();

    public int size();

    public void print();
}

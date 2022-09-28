package queue_generic;

public interface QueueGeneric<T> {
    // Thêm phần tử vào cuối hàng
    public void enqueue(T t);

    // Lấy phần tử đầu hàng và xoá
    public T dequeue();

    // Check xem có rỗng hay ko
    public boolean isEmpty();

    // Check xem có đầy hay ko?
    public boolean isFull();

    // Kích thước thực tế
    public int size();

    // Lấy giá trị đầu hàng và không xoá
    public T peek();

    // In ra hàng đợi
    public void display();
}

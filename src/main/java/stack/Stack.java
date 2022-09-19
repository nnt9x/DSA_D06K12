package stack;// stack.Stack implementation in Java

// Stack lưu trữ số nguyên

class Stack {
    // Mảng số int
    private int arr[];
    // Vị trí index của phần tử trên cùng - top
    private int top;
    // Kích thước stack
    private int capacity;

    // Creating a stack
    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Add elements into stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }

//        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // Remove element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr[top--];
    }

    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // Check if the stack is empty
    public Boolean isEmpty() {
        if (top == -1) return true;
        else return false;
    }

    // Check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.print("\t" + arr[i]);
        }
        System.out.println();
    }
}
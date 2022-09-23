package thread;

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();
        System.out.println("Run from main thread");

        Thread thread2 = new Thread(new MyThread2());
        thread2.start();
    }
}

package thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        // VD: in ra các số từ 1 đến 10 (1s tăng lên 1 đơn vị)
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Kết thúc");
    }
}

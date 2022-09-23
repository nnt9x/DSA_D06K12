package queue;

import java.util.Queue;

public class MyThread1 extends Thread {

    private Queue<Notify> notifyQueue;

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public MyThread1(Queue<Notify> notifyQueue) {
        this.notifyQueue = notifyQueue;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5; i++) {
            int rdSeconds = getRandomNumber(5000, 10000);
            try {
                Thread.sleep(rdSeconds);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // Tạo ra thông báo => gửi vào hàng đợi.
            Notify item = new Notify();
            item.setId(getRandomNumber(0, 1000));
            item.setContent("FROM THREAD 1");
            item.setType(1);

            notifyQueue.add(item);
        }
    }
}

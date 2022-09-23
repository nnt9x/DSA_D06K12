package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        // 1 hàng đợi thông báo
        Queue<Notify> notifyQueue = new ArrayDeque<>();

        // Tạo luồng 1
        MyThread1 thread1 = new MyThread1(notifyQueue);

        // Tạo luồng 2
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    int rdSeconds = getRandomNumber(1000, 3000);
                    try {
                        Thread.sleep(rdSeconds );
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    // Tạo ra thông báo => gửi vào hàng đợi.
                    Notify item = new Notify();
                    item.setId(getRandomNumber(2000, 3000));
                    item.setContent("FROM THREAD 2");
                    item.setType(2);

                    notifyQueue.add(item);
                }
            }
        });

        // Chạy 2 luồng
        thread1.start();
        thread2.start();

        // Cv chính main thread -> 1s kiểm tra
        while (true){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(!notifyQueue.isEmpty()){
                Notify notify = notifyQueue.poll();
                // Hiển thị lên
                System.out.println(notify);
            }
        }

    }
}

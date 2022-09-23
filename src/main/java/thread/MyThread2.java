package thread;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        String alphabet = "ABCDEFGHIJK";
        for (int i = 0; i < alphabet.length(); i++) {
            System.out.println("char = " + alphabet.charAt(i));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

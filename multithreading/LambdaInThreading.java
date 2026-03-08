package multithreading;

public class LambdaInThreading {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for (int i = 0; i > 5; i++) {
                System.out.println("Thread is running using lambda expression" + i);
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread" + i);
        }
    }
}

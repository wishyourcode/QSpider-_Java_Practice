package multithreading;

public class JoinThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

class Demo {
    public static void main(String[] args) {
        try {
            JoinThread t1 = new JoinThread();
            t1.start();

            t1.join(); // main thread waits until t1 finishes
        } catch (Exception e) {
            System.out.println(e);
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
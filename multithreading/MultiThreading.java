package multithreading;

public class MultiThreading extends Thread {

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

class Demo {
    public static void main(String[] args) {
        MultiThreading t1 = new MultiThreading();
        t1.start();

        for (int i = 0; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
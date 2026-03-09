package multithreading;

public class RunnableThread implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable interface");
    }
}

class Test {
    public static void main(String[] args) {
        RunnableThread obj = new RunnableThread();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
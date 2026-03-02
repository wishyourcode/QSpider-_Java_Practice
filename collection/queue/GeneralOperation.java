package queue;

import java.util.Queue;
import java.util.LinkedList;

public class GeneralOperation {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        System.out.println("Initially empty? " + q.isEmpty());

        // Enqueue elements
        q.add(10); // throws exception if it fails
        q.offer(20); // returns false if it fails
        q.offer(30);
        System.out.println("After enqueues: " + q);
        System.out.println("Size: " + q.size());
    }
}

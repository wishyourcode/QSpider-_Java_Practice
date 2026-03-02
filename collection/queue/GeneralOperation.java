package queue;

import java.util.Queue;
import java.util.LinkedList;

public class GeneralOperation {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        System.out.println("Initially empty? " + q.isEmpty());

        // Enqueue elements
        q.add(10); // throws exception if it fails
        q.add(10); // throws exception if it fails
        q.add(10); // throws exception if it fails
        q.add(10); // throws exception if it fails
        q.offer(20); // returns false if it fails
        q.offer(20); // returns false if it fails
        q.offer(20); // returns false if it fails
        q.offer(20); // returns false if it fails
        q.offer(20); // returns false if it fails
        q.offer(20); // returns false if it fails
        q.offer(30);
        System.out.println("After enqueues: " + q);
        System.out.println("Size: " + q.size());
        // Peek at head without removing
        System.out.println("Peek: " + q.peek()); // null if empty
        System.out.println("Element: " + q.element()); // throws if empty

        // Dequeue elements
        System.out.println("Poll: " + q.poll()); // removes head or returns null
        System.out.println("Remove: " + q.remove()); // removes head or throws
        System.out.println("After dequeues: " + q);

        // Other operations
        System.out.println("Contains 30? " + q.contains(30));
        System.out.println("Is empty? " + q.isEmpty());

        // Clear the queue
        q.clear();
        System.out.println("After clear, is empty? " + q.isEmpty());
    }
}

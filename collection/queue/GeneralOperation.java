package queue;

import java.util.Queue;

public class GeneralOperation {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.add(null);
        System.out.println(q.isEmpty());
        System.out.println(q);

    }
}

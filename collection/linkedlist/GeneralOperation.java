package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class GeneralOperation {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        // populate
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        // deque-style additions
        ll.addFirst(5);
        ll.addLast(60);
        ll.offer(70); // offer to tail

        System.out.println("Initial LinkedList: " + ll);
        System.out.println("size: " + ll.size());
        System.out.println("contains 30: " + ll.contains(30));
        System.out.println("indexOf 40: " + ll.indexOf(40));
        System.out.println("getFirst: " + ll.getFirst() + ", getLast: " + ll.getLast());

    }

}

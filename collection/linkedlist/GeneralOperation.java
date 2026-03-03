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

        // random-access (note: LinkedList.get(i) is O(n))
        System.out.print("For-index iteration: ");
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
        System.out.println();

        // enhanced for-loop
        System.out.print("Enhanced for-loop: ");
        for (Integer n : ll)
            System.out.print(n + " ");
        System.out.println();

        // Iterator
        System.out.print("Iterator: ");
        Iterator<Integer> it = ll.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();

        // ListIterator forward and backward
        System.out.print("ListIterator forward: ");
        ListIterator<Integer> litr = ll.listIterator();
        while (litr.hasNext())
            System.out.print(litr.next() + " ");
        System.out.println();

        System.out.print("ListIterator backward: ");
        while (litr.hasPrevious())
            System.out.print(litr.previous() + " ");
        System.out.println();

    }
}

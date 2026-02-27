package arraylist;

import java.util.Iterator;
import java.util.ArrayList;

public class SecondLastUsingIterator {
    public static void main(String[] args) {
        ArrayList<Integer> Q1 = new ArrayList<>();
        Q1.add(10);
        Q1.add(20);
        Q1.add(30);
        Q1.add(40);
        Q1.add(50);
        Q1.add(60);
        Q1.add(70);
        findSecondLast(Q1);

    }

    public static void findSecondLast(ArrayList<Integer> q1) {
        // using iterator
        Iterator<Integer> i = q1.iterator();
        int max = 0;
        int secondmax = 0;
        while (i.hasNext()) {
            secondmax = max;
            max = (int) i.next();
        }
        System.out.println("Second Last Element: " + secondmax);
    }
}
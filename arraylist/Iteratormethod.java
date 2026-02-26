package arraylist;

import java.util.*;

public class Iteratormethod {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);
        ls.add(10);
        System.out.println(ls);
        Iterator<Integer> i = ls.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            System.out.println(i.hasNext());
        }

    }
}

package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListIteratordemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(list);
        System.out.println("=====================");
        ListIterator<Integer> li = list.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
        System.out.println("================");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}

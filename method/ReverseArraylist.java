package method;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist {

    public static void reverseArrayList(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list: " + list);
        reverseArrayList(list);
        System.out.println("Reversed list: " + list);
    }
}

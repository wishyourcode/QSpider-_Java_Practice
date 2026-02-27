package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class MissingNumber {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 13, 14, 15));
        Collections.sort(al);

        ListIterator<Integer> i = al.listIterator();

        while (i.hasNext()) {
            int num1 = i.next();
            int num2 = i.next();
            if (num2 - num1 != 1) {
                System.out.println(num1 + 1);
            }
            if (i.hasNext()) {
                i.previous();
            }
        }

        for (int j = 0; j < al.size() - 1; j++) {
            if (al.get(j + 1) - al.get(j) != 1) {
                System.out.println(al.get(j) + 1);
            }
        }
    }
}

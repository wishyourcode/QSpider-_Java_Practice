package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

import java.util.Iterator;

public class EvenNeber {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        ListIterator<Integer> i = al.listIterator();
        Iterator<Integer> i2 = al.iterator();

        // 2. Print even element sum

        while (i.hasNext()) {
            int temp = i.next();
            if (temp % 2 == 0) {
                System.out.println(temp);
            }
        }

        for (int j = 0; j < al.size(); j++) {
            if (al.get(j) % 2 == 0) {
                System.out.println(al.get(j));
            }
        }

        for (Integer num : al) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        while (i2.hasNext()) {
            int temp = i2.next();
            if (temp % 2 == 0) {
                System.out.println(temp);
            }
        }
    }

}

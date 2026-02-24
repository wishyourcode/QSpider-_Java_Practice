package collection.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class SecondLargest {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(16, 2, 3, 4, 5, 6, 17, 8, 9, 10, 11, 12, 13, 14, 15));

        ListIterator<Integer> i = al.listIterator();

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        while (i.hasNext()) {
            int temp = i.next();
            if (temp > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = temp;
            } else if (temp > secondLargest && temp < firstLargest) {
                secondLargest = temp;
            }
        }
        System.out.println(secondLargest);

        firstLargest = Integer.MIN_VALUE;
        secondLargest = Integer.MIN_VALUE;

        for (int j = 0; j < al.size(); j++) {
            if (al.get(j) > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = al.get(j);
            } else if (al.get(j) > secondLargest && al.get(j) < firstLargest) {
                secondLargest = al.get(j);
            }
        }
        System.out.println(secondLargest);

        firstLargest = Integer.MIN_VALUE;
        secondLargest = Integer.MIN_VALUE;

        for (Integer num : al) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num < firstLargest) {
                secondLargest = num;
            }
        }
        System.out.println(secondLargest);

    }
}

package assignment;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.ListIterator;
import java.util.Iterator;

public class PrimeNumber {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

        Iterator<Integer> i = al.iterator();

        int index = 0;
        while (index < al.size()) {
            if (isPrime(al.get(index))) {
                System.out.println(al.get(index));
            }
            index++;
        }

        while (i.hasNext()) {
            int temp = i.next();
            if (isPrime(temp)) {
                System.out.println(temp);
            }
        }

        for (int j = 0; j < al.size(); j++) {
            if (isPrime(al.get(j))) {
                System.out.println(al.get(j));
            }
        }

        for (Integer num : al) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    private static boolean isPrime(Integer integer) {
        if (integer == 1)
            return false;
        for (int i = 2; i < integer; i++) {
            if (integer % i == 0) {
                return false;
            }
        }
        return true;
    }
}

package assignment;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.ListIterator;

public class ReverseArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

        // ListIterator<Integer> i = al.listIterator();
        // ListIterator<Integer> i2 = al.listIterator(al.size());

        int left = 0, right = al.size() - 1;
        while (left < right) {
            swap(left++, right--, al);
        }
        System.out.println(al);

        // int low = i.nextIndex(), high = i2.previousIndex();
        // while (low < high){
        // int temp1 = i.next();
        // int temp2 = i2.previous();
        // al.set(low,temp2);
        // al.set(high,temp1);
        // low = i.nextIndex();
        // high = i2.previousIndex();
        // }
        // System.out.println(al);

        for (int j = 0, k = al.size() - 1; j < k; j++, k--) {
            swap(j, k, al);
        }
        System.out.println(al);

    }

    public static void swap(int a, int b, ArrayList<Integer> al) {
        int temp = al.get(a);
        al.set(a, al.get(b));
        al.set(b, temp);
    }

}

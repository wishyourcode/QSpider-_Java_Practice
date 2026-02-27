package arraylist;

import java.util.ArrayList;

public class EvenElementSum {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);
        li.add(7);
        li.add(8);
        li.add(9);
        li.add(10);
        int ans = evensum(li);
        System.out.println(ans);
    }

    public static int evensum(ArrayList<Integer> li) {
        int sum = 0;
        for (Integer num : li) {
            if (num % 2 == 0) {
                sum += num;
            }

        }
        return sum;
    }
}

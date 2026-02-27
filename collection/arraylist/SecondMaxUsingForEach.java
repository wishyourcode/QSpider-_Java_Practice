package arraylist;

import java.util.ArrayList;

public class SecondMaxUsingForEach {
    public static void main(String[] args) {
        ArrayList<Integer> Q1 = new ArrayList<>();
        Q1.add(10);
        Q1.add(20);
        Q1.add(30);
        Q1.add(40);
        Q1.add(50);
        Q1.add(60);
        Q1.add(70);
        findSecondMax(Q1);
    }

    public static void findSecondMax(ArrayList<Integer> q1) {
        int max = 0;
        int secondMax = 0;
        for (Integer num : q1) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        System.out.println("Second Maximum: " + secondMax);
    }
}

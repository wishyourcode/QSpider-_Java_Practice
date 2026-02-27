package searchelement;

import java.util.ArrayList;

public class Containsmethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(2);
        list.add(121);
        list.add(1232);
        list.add(1212);
        System.out.println(list);
        System.out.println("========================");
        int keyElement = 121;
        if (list.contains(keyElement)) {
            System.out.println(keyElement + "Is present in list");
        } else {
            System.out.println(keyElement + "Is not present in list");
        }
    }
}

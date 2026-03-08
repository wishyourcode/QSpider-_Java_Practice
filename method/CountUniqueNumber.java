package method;

import java.util.HashSet;
import java.util.Set;

public class CountUniqueNumber {

    public static int countUnique(int[] arr) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : arr) {
            uniqueNumbers.add(num);
        }
        return uniqueNumbers.size();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
        System.out.println("Number of unique elements: " + countUnique(arr));
    }
}

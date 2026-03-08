package method;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumber {

    public static boolean hasUniqueDigits(int num) {
        Set<Integer> digits = new HashSet<>();
        num = Math.abs(num); // handle negative numbers
        while (num > 0) {
            int digit = num % 10;
            if (!digits.add(digit)) {
                return false; // duplicate digit found
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 12345;
        if (hasUniqueDigits(number)) {
            System.out.println(number + " has all unique digits");
        } else {
            System.out.println(number + " has duplicate digits");
        }
    }
}

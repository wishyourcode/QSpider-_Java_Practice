package file_handling;

import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) throws MarriageException {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        try {
            checkage(age);
        } catch (MarriageException e) {
            System.out.println("Exception : " + e.getMessage());
        }
        input.close();
    }

    public static void checkage(int age) {
        if (age < 18) {
            throw new MarriageException("Below Age");
        }
        if (age > 90) {
            throw new MarriageException("Mar ja re");
        } else {
            System.out.println("Happy Honeymoon");
        }
    }
}

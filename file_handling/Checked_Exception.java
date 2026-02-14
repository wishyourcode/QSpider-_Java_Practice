package file_handling;

import java.util.Scanner;

public class Checked_Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 2 Number");
        int l = input.nextInt();
        int b = input.nextInt();
        input.close();
        try {
            System.out.println(calArea(l, b));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int calArea(int l, int b) throws Exception {
        if (l < 0 || b < 0) {
            throw new Exception("Using negative number cant be calculate area");
        } else {
            return l * b;
        }
    }
}

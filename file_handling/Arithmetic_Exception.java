package file_handling;

import java.util.Scanner;

public class Arithmetic_Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the second number");
        int b = input.nextInt();
        try {
            int c = a / b;
            System.out.println("Result is : " + c);
        } catch (ArithmeticException c) {
            System.out.println("divide by zero exception ocuurs");
        }
        System.out.println("Radhe Radhe");
    }
}

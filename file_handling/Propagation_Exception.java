package file_handling;

public class Propagation_Exception {
    public static void A4() {
        int a = 10;
        int b = 0;
        int c = a / b;
        System.out.println("Result is : " + c);
    }

    public static void A3() {
        A4();
    }

    public static void A2() {
        A3();
    }

    public static void A1() {
        A2();
    }

    public static void main(String[] args) {
        try {
            A1();
        } catch (ArithmeticException c) {
            System.out.println("divide by zero exception occurs");
        }
        System.out.println("Radhe Radhe");
    }

}

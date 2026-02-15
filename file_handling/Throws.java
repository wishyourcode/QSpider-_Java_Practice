package file_handling;

public class Throws {
    public static void m1() {
        System.out.println(10 / 0);
    }

    public static void m2() {
        m1();
    }

    public static void m3() {
        m2();
    }

    public static void m4() {
        m3();
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        try {
            m4();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Main end");
    }
}

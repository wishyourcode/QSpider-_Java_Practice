package file_handling;

public class Demoprint_Stack_Trace {
    static void m1() {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    static void m2() {
        m1();
    }

    static void m3() {
        m2();
    }

    static void m4() {
        m3();
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        m1();
        System.out.println("Main end");
    }
}

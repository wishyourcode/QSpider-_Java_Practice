package file_handling;

class LowBalanceException extends Exception {

    public String toString() {
        return "Balance should not be less than 5000";
    }
}

public class checkedException {
    static void m1() {
        try {

            throw new LowBalanceException();
        } catch (LowBalanceException e) {
            System.out.println(e);
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
        m4();
    }
}

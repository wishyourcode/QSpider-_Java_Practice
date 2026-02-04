package polymorphism;

public class Driver {
    public static void main(String[] args) {
        parent p = new child();
        p.method1();
        p.method2();
    }
}

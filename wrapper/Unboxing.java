package wrapper;

public class Unboxing {
    public static void main(String[] args) {
        int a = 10;
        Integer b = Integer.valueOf(a);
        System.out.println(b);

        int d = b.intValue(); // Unboxing
        System.out.println(d);
        int c = b; // Auto-unboxing
        System.out.println(c);
    }
}

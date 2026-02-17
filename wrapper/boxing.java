package wrapper;

public class boxing {
    public static void main(String[] args) {
        int a = 10;
        Integer i = Integer.valueOf(a); // Boxing
        System.out.println(i);

        Integer j = 20; // Auto-boxing
        System.out.println(j);
    }
}
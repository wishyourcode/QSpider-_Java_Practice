package method;

public class FibonacciNumber2 {

    public static int fibonacci(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;

        int a = 0, b = 1;
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
    }
}

package method;

public class FibonacciNumber {

    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence up to " + n + ": ");
        if (n >= 0)
            System.out.print(a + " ");
        if (n >= 1)
            System.out.print(b + " ");

        int next = a + b;
        while (next <= n) {
            System.out.print(next + " ");
            a = b;
            b = next;
            next = a + b;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int limit = 100; // Print Fibonacci numbers up to 100
        printFibonacci(limit);
    }
}

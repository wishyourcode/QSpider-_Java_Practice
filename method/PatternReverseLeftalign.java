package method;

public class PatternReverseLeftalign {
    // * * * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void main(String[] args) {
        int n = 6; // Number of rows for the pattern
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

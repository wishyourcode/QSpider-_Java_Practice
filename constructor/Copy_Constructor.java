package constructor;

class Example {
    private int a;
    private int b;

    Example(int a, int b) {
        System.out.println("Main constructor called");
        this.a = a;
        this.b = b;
    }

    Example(Example c) {
        this.a = c.a;
        this.b = c.b;
    }

    public void Display() {
        System.out.println("value of the a is : " + a);
        System.out.println("value of the b is : " + b);
    }
}

public class Copy_Constructor {

    public static void main(String[] args) {
        Example E1 = new Example(3, 5);
        // copy construcotr
        Example E2 = new Example(E1);
        // assigning constructor not copy constructor
        Example E3 = E2;
        System.out.println("===============================");
        E2.Display();
        System.out.println("===============================");
        E3.Display();
        System.out.println("===============================");
        E1.Display();
    }
}
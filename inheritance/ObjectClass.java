package inheritance;

class Vishal {
    int a = 20;
}

public class ObjectClass {
    public static void main(String[] args) {
        Vishal1 v1 = new Vishal1();
        System.out.println(v1);
        int b1 = v1.hashCode();
        System.out.println(b1);
        int c1 = v1.hashCode();
        System.out.println(c1);

    }

}

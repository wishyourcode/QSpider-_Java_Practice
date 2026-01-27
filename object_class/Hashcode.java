package object_class;

class Demo {
    int x = 10;
}

public class Hashcode {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
    }
}

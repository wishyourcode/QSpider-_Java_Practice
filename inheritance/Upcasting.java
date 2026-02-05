package inheritance;

class Vishal1 {
    int a = 10;
    String name = "Vishal";
}

class Piyush extends Vishal1 {
    int b = 20;
}

class third1 extends Piyush {
    int c = 30;
}

class fourth1 extends third1 {
    int d = 45;
}

public class Upcasting {
    public static void main(String[] args) {
        third1 c1 = new fourth1();
        System.out.println(c1.c);
    }

}

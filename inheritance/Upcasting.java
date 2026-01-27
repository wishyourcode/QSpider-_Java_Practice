package inheritance;

class Vishal {
    int a = 10;
    String name = "Vishal";
}

class Piyush extends Vishal {
    int b = 20;
}

class third extends Piyush {
    int c = 30;
}

class fourth extends third {
    int d = 45;
}

public class Upcasting {
    public static void main(String[] args) {
        third c1 = new fourth();
        System.out.println(c1.c);
    }

}

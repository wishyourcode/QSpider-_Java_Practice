package inheritance;

class first {
    int a = 10;
}

class second extends first {
    int b = 20;
}

class third extends second {
    int c = 40;
}

class fourth extends third {
    int d = 66;
}

public class DownCasting {
    public static void main(String[] args) {
        // upcasting
        third t1 = new fourth();
        // downcasting
        fourth f1 = (fourth) t1;
        System.out.println(f1.a);
        System.out.println(f1.b);
        System.out.println(f1.c);
        System.out.println(f1.d);
    }
}
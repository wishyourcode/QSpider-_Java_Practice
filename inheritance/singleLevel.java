package inheritance;

class parent {
    String name = "Manoj Mishra";
    int age = 50;

    public void display() {
        System.out.println("Father Name: " + name);
        System.out.println("Father Age: " + age);
    }
}

class child extends parent {
    String Sonname = "Vishal Mishra";
    int Sonage = 25;

    public void show() {
        System.out.println("Father Name: " + name);
        System.out.println("Son Name: " + Sonname);
        System.out.println("Son Age: " + Sonage);
    }

}

public class singleLevel {
    public static void main(String[] args) {
        parent p = new parent();
        p.display();
        child c = new child();
        c.show();
    }
}
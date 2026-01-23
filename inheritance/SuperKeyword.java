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
    String name = "Vishal Mishra";
    int age = 25;

    public void show() {
        System.out.println("father Name: " + super.name);
        System.out.println("Son Name: " + name);
        System.out.println("Son Age: " + age);
        System.out.println("Fahter Age: " + super.age);
    }

}

public class SuperKeyword {
    public static void main(String[] args) {
        child c = new child();
        c.show();
    }
}

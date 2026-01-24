package inheritance;

class father {
    String name = "Vishal";
    int Age = 23;

    public void displayInfo() {
        System.out.println("father Name is : " + name);
        System.out.println("father age is : " + Age);
    }
}

class son extends father {
    String Name = "Anvish";
    int Age = 2;

    public void displayInfo() {
        System.out.println("father name is : " + super.name);
        System.out.println("father Age is : " + super.Age);
        System.out.println("Son Name is : " + Name);
        System.out.println("Son age is : " + Age);
    }
}

class daugther extends father {
    String Name = "Vishita";
    int Age = 4;

    public void displayInfo() {
        System.out.println("father name is : " + super.name);
        System.out.println("father Age is : " + super.Age);
        System.out.println("father Name is : " + Name);
        System.out.println("father age is : " + Age);

    }
}

public class hierarchical {
    public static void main(String[] args) {
        daugther D1 = new daugther();
        D1.displayInfo();
    }
}

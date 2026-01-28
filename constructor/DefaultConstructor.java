package constructor;

class employee {
    String name;
    int age;

    public void PrintDisplay() {
        System.out.println("Name is : " + name);
        System.out.println("age is : " + age);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        employee E1 = new employee();
        E1.name = "vishal";
        E1.age = 23;
        E1.PrintDisplay();
    }
}

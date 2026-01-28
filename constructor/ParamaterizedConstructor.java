package constructor;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void DisplayStudent() {
        System.out.println("Name of the Student is " + name);
        System.out.println("Age of the Student is " + age);

    }
}

public class ParamaterizedConstructor {
    Student s1 = new Student("Vishal Mishra", 23);
}

package object_class;

import java.util.Objects;

public class overriding {
    int id;
    String name;
    int age;

    overriding(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student id is " + id + " \nname is " + name + "\nage is " + age;
    }

    public boolean equals(Object obj) {
        overriding student = (overriding) obj;
        if (this.id == student.id && this.name.equals(student.name) && this.age == student.age) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        // return Integer.hashCode(id) + name.hashCode() + Integer.hashCode(age);
        return Objects.hash(id, name, age);
    }

    public static void main(String[] args) {
        overriding student = new overriding(1, "Vishal", 23);
        overriding student1 = new overriding(1, "Vishal", 23);
        overriding student2 = new overriding(2, "Vishal", 23);
        System.out.println("student hashcode is " + student.hashCode()); // Output: 123456789
        System.out.println("student1 hashcode is " + student1.hashCode()); // Output
        System.out.println(student.hashCode() == student1.hashCode()); // Output: 123456789
        System.out.println("Is student is equal to student 1 : " + student.equals(student1)); // Output: true
        System.out.println("Is student is equal to student 2 : " + student.equals(student2)); // Output: false
        System.out.println(student); // Output: Student id is 1 and name is Vishal
        // and age is 23
    }
}

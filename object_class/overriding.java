package object_class;

public class overriding {
    int id;
    String name;
    int age;

    public String toString() {
        return "Student id is " + id + " \nname is " + name + "\nage is " + age;
    }

    public static void main(String[] args) {
        overriding student = new overriding();
        student.id = 1;
        student.name = "Vishal";
        student.age = 23;
        System.out.println(student); // Output: Student id is 1 and name is Vishal
        // and age is 23
    }
}

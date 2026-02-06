package object_class;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}

public class toStringe_Eample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Vishal");
        // toString() by default return the logical reference of the object, but we have
        // overridden it to return a more meaningful string representation of the
        // Student object.
        System.out.println(s1.toString()); // Explicitly calling toString() method
        System.out.println(s1); // This will call the toString() method of Student class
    }
}

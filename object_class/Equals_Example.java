package object_class;

class Student1 {
    int id;
    String name;

    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        Student1 st = (Student1) obj; // Downcasting the Object to Student1
        if (this.id == st.id && this.name.equals(st.name)) {
            return true; // Both id and name are the same
        } else {
            return false; // Either id or name is different
        }
    }
}

public class Equals_Example {

    public static void main(String[] args) {
        Student1 s1 = new Student1(1, "Vishal");
        Student1 s2 = new Student1(1, "Vishal");
        System.out.println(s1.equals(s2)); // This will call the equals method of Student1 class
    }
}

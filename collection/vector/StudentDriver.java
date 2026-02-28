package vector;

import java.util.Vector;

public class StudentDriver {
    public static void main(String[] args) {
        Vector<Student> v = new Vector<>();
        v.add(new Student(101, "Vishal Mishra", "IT"));
        v.add(new Student(101, "Vishal Mishra", "IT"));
        v.add(new Student(101, "Vishal Mishra", "IT"));

        System.out.println(v);
    }

}

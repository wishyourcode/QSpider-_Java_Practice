package vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class StudentDriver {
    public static void main(String[] args) {
        Vector<Student> v = new Vector<>();
        v.add(new Student(101, "Vishal Mishra", "IT"));
        v.add(new Student(101, "Vishal Mishra", "IT"));
        v.add(new Student(101, "Vishal Mishra", "IT"));

        System.out.println(v);
        ListIterator<Student> i = v.listIterator();
        while (i.hasNext()) {
            Student temp = i.next();
            System.out.println(temp);
            System.out.println("=====================");
        }

        ListIterator<Student> i2 = v.listIterator();
        while (i.hasPrevious()) {
            Student temp = i2.previous();
            System.out.println(temp);
            System.out.println("====================");
        }
        Iterator<Student> i3 = v.iterator();
        while (i.hasNext()) {
            Student temp = i3.next();
            System.out.println(temp);
            System.out.println("===============");
        }

    }

}

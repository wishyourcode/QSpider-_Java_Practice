package arraylist;

import java.util.ArrayList;

public class Student {
    private int stuId;
    private String name;

    public String getname() {
        return name;
    }

    public int getstuId() {
        return stuId;
    }

    public void setstuId(int stuId) {
        this.stuId = stuId;
    }

    public void setname(String name) {
        this.name = name;
    }

    Student(int stuId, String name) {
        this.stuId = stuId;
        this.name = name;
    }

    public String toString() {
        return ("Student ID : " + stuId + "\n student Name : " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Vishal");
        Student s2 = new Student(102, "Piyush");
        Student s3 = new Student(103, "Mishra");
        ArrayList ls = new ArrayList();
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        ls.add(new Student(0, "Radhe Radhe"));
        System.out.println(ls);

        System.out.println("=====================================");
        ls.add(2, new Student(0, "Govind"));
        System.out.println(ls);
    }
}

package encapsulation;

public class Student {
    private int id;
    private String name;
    private String course;
    private int marks;
    private int age;

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getcourse() {
        return course;
    }

    public void setcourse(String course) {
        this.course = course;
    }

    public int getmarks() {
        return marks;
    }

    public void setmarks(int marks) {
        this.marks = marks;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }
}

class StudentDriver {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.setcourse("IT");
        System.out.println(S1.getcourse());
    }
}

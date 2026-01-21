package relationship;

public class Student {
    private String name;
    private int rollNo;

    public String getname() {
        return name;
    }

    public int getrollNo() {
        return rollNo;
    }

    public void setname(String name) {
        this.name = name;
    }

    public Student setrollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayStudent() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll No : " + rollNo);
    }

}

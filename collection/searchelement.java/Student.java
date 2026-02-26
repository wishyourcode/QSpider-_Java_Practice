import java.util.Objects;

public class Student {

    private int rollNo;
    private String name;
    private String course;
    private double percentage;
    private String college;

    public Student(int rollNo, String name, String course, double percentage, String college) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.percentage = percentage;
        this.college = college;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo +
                "\nName: " + name +
                "\nCourse: " + course +
                "\nPercentage: " + percentage +
                "\nCollege: " + college + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return rollNo == s.rollNo &&
                Double.compare(s.percentage, percentage) == 0 &&
                Objects.equals(name, s.name) &&
                Objects.equals(course, s.course) &&
                Objects.equals(college, s.college);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name, course, percentage, college);
    }
}
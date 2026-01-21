package relationship;

public class College {
    private String collegeName;
    private int studentCount;

    public String getcollegeName() {
        return collegeName;
    }

    public void setcollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getstudentCount() {
        return studentCount;
    }

    public College setstudentCount(int studentCount) {
        this.studentCount = studentCount;
        return this;
    }

    College(String collegeName, int studentCount) {
        this.collegeName = collegeName;
        this.studentCount = studentCount;
    }

    public void displayCollege() {
        System.out.println("College Name : " + collegeName);
        System.out.println("Total Students : " + studentCount);
    }

    Student S1 = new Student("Piyush", 10);

}

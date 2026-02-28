package vector;

public class Student {
    int stdNo;
    String stdName;
    String dName;

    Student(int stdNo, String stdName, String dname) {
        this.stdNo = stdNo;
        this.stdName = stdName;
        this.dName = dname;
    }

    public String toString() {
        return "ROll Number of the Student is: " + stdNo + "\n Name of the Student is: " + stdName
                + "\n Department Name of the Student is: " + dName + "\n";
    }

}

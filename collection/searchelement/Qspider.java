package collection.searchelement;

import java.util.Objects;

public class Qspider {
    private int stdId;
    private String name;
    private String batch;
    private String collName;
    private double salary;

    public Qspider(int stdId, String name, String batch, String collName, double salary) {
        this.stdId = stdId;
        this.name = name;
        this.batch = batch;
        this.collName = collName;
        this.salary = salary;
    }

    public int getStdId() {
        return stdId;
    }

    public String getName() {
        return name;
    }

    public String getBatch() {

        return batch;
    }

    public String getCollName() {
        return collName;
    }

    public double getSalary() {
        return salary;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setCollName(String collName) {
        this.collName = collName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Student Id is: " + stdId + "\n Name of the Student is: " + name + "\n Batch No of the Student is: "
                + batch + "\n College name of the student is: " + collName + "\n Salary of the Student is: " + salary
                + "\n";
    }

    public boolean equals(Object obj) {
        Qspider qsp = (Qspider) obj;
        if (this.stdId == qsp.stdId && this.name.equalsIgnoreCase(qsp.batch) && this.batch.equalsIgnoreCase(qsp.batch)
                && this.collName.equalsIgnoreCase(qsp.collName) && this.salary == qsp.salary) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(stdId, name, batch, collName, salary);
    }
}

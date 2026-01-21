package relationship;

public class Employee {
    private String name;
    private double salary;

    public String getname() {
        return name;
    }

    public double getsalary() {
        return salary;
    }

    public void setname(String name) {
        this.name = name;
    }

    public Employee setsalary(double salary) {
        this.salary = salary;
        return this;
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayEmp() {
        System.out.println("Name of the Employee is : " + name);
        System.out.println("Salary of the this Employee is :" + salary);
    }
}

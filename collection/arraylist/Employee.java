package arraylist;

import java.util.ArrayList;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private int salary;
    private String company;

    Employee(int id, String name, String dept, int salary, String company) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.company = company;
    }

    public String toString() {
        return ("Employee ID : " + id + "\n Employee Name : " + name + "\n Employee Dept : " + dept
                + "\n Employee Salary : " + salary + "\n Employee Company : " + company);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Vishal", "IT", 50000, "TCS");
        Employee e2 = new Employee(102, "Piyush", "HR", 40000, "Wipro");
        Employee e3 = new Employee(103, "Mishra", "Admin", 30000, "Infosys");
        ArrayList<Employee> ls = new ArrayList<>();
        ls.add(e1);
        ls.add(e2);
        ls.add(e3);
        ls.add(new Employee(0, "Radhe Radhe", "Sales", 20000, "HCL"));
        System.out.println(ls);
        System.out.println("=====================================");
        ls.add(2, new Employee(0, "Govind", "Marketing", 25000, "Capgemini"));
        System.out.println(ls);
    }
}

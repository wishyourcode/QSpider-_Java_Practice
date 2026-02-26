package collection.searchelement;

import java.util.Objects;

public class Employee {

    private int empId;
    private String empName;
    private String department;
    private double salary;
    private String company;

    public Employee(int empId, String empName, String department, double salary, String company) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
        this.company = company;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee Id: " + empId +
                "\nEmployee Name: " + empName +
                "\nDepartment: " + department +
                "\nSalary: " + salary +
                "\nCompany: " + company + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        return empId == e.empId &&
                Double.compare(e.salary, salary) == 0 &&
                Objects.equals(empName, e.empName) &&
                Objects.equals(department, e.department) &&
                Objects.equals(company, e.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, department, salary, company);
    }
}
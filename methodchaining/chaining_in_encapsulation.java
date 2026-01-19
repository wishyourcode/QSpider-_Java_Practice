package methodchaining;

public class chaining_in_encapsulation {
    private String empName;
    private int empId;
    private double empSalary;

    public chaining_in_encapsulation setEmpName(String empName) {
        this.empName = empName;
        return this;
    }

    public chaining_in_encapsulation setEmpId(int empId) {
        this.empId = empId;
        return this;
    }

    public chaining_in_encapsulation setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
        return this;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpId() {
        return empId;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public static void main(String[] args) {
        chaining_in_encapsulation emp = new chaining_in_encapsulation();
        emp.setEmpName("John Doe")
                .setEmpId(101)
                .setEmpSalary(75000.00);

        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Salary: " + emp.getEmpSalary());
    }
}

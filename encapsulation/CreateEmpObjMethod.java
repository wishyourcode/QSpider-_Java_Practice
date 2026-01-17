package encapsulation;

class Employee {
    private String empName;
    private int empId;
    private double empSalary;

    public static void createEmpObj(Employee emp) {
        System.out.println("Employee Object Created" + emp);
    }

    // Method to create and initialize employee object
    public void createEmployee(String name, int id, double salary) {
        this.empName = name;
        this.empId = id;
        this.empSalary = salary;
    }

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Salary: " + empSalary);
    }

    public static void main(String[] args) {
        Employee E1 = new Employee();
        createEmpObj(E1);
        E1.createEmployee("Vishal Mishra", 101, 55000);
        E1.displayEmployee();
    }
}

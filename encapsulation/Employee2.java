package encapsulation;

public class Employee2 {
    String empName;
    int empId;
    double empSalary;

    public static void displayEmpObj(Employee2 emp) {
        System.out.println("Employee Object Created: " + emp);
    }

    public static void main(String[] args) {
        Employee2 E1 = new Employee2();
        displayEmpObj(E1);
    }
}

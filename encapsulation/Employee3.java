package encapsulation;

public class Employee3 {
    String empName;
    int empId;
    double empSalary;

    public static void createEmpObj(Employee3 emp) {
        System.out.println("Employee Object Created" + emp);
    }

    public static void main(String[] args) {
        Employee3 E1 = new Employee3();
        createEmpObj(E1);
    }
}

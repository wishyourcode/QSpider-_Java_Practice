package encapsulation;

class Employee {
    String empName;
    int empId;
    double empSalary;

    public static void createEmpObj(Employee emp) {
        System.out.println("Employee Object Created" + emp);
    }
}

public class CreateEmpObjMethod {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        Employee.createEmpObj(E1);
    }
}

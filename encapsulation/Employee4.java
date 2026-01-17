package encapsulation;

public class Employee4 {
    String empName;
    int empId;
    double empSalary;

    public static Employee4 createEmpObj() {
        System.out.println("Employee Object Created");
        return new Employee4();
    }

    public static void main(String[] args) {
        Employee4 E1 = createEmpObj();
        System.out.println(E1);
    }
}

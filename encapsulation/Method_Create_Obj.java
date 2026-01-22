package encapsulation;

public class Employee1 {
    String empName;
    int empId;
    double empSalary;

    public static Employee1 createEmpObj() {
        System.out.println("Employee Object Created");
        return new Employee1();

    }

    public static void main(String[] args) {
        Employee1 E1 = createEmpObj();
        System.out.println(E1);
    }
}

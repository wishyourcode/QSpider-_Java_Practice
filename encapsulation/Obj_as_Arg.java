package encapsulation;

public class Obj_as_Arg {
    String empName;
    int empId;
    double empSalary;

    public static void displayEmpDetails(Obj_as_Arg emp) {
        System.out.println("Employee Name: " + emp.empName);
        System.out.println("Employee ID: " + emp.empId);
        System.out.println("Employee Salary: " + emp.empSalary);
    }

    public static void main(String[] args) {
        Obj_as_Arg E1 = new Obj_as_Arg();
        E1.empName = "Piyush";
        E1.empId = 101;
        E1.empSalary = 75000.0;

        displayEmpDetails(E1);
    }
}

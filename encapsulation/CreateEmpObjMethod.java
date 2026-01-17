package encapsulation;

public class CreateEmpObjMethod {
    String empName;
    int empId;
    double empSalary;

    public static CreateEmpObjMethod createEmpObj() {
        System.out.println("Employee Object Created");
        return new CreateEmpObjMethod();
    }

    public static void main(String[] args) {
        CreateEmpObjMethod E1 = createEmpObj();
        System.out.println(E1);
    }
}
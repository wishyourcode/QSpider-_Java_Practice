package encapsulation;

public class Method_Create_Obj {
    String empName;
    int empId;
    double empSalary;

    public static Method_Create_Obj createEmpObj() {
        System.out.println("Employee Object Created");
        return new Method_Create_Obj();

    }

    public static void main(String[] args) {
        Method_Create_Obj E1 = createEmpObj();
        System.out.println(E1);
    }
}

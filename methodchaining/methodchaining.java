package methodchaining;

public class methodchaining {
    String empName;
    int empId;
    double empSalary;

    public static methodchaining createEmpObj() {
        System.out.println("Employee Object Created");
        return new methodchaining();
    }

    public static void main(String[] args) {
        methodchaining E1 = createEmpObj();
        System.out.println(E1);
    }
}

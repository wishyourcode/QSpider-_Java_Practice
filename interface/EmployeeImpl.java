interface Employee {
    void work();
}

public class EmployeeImpl implements Employee {
    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    public static void main(String[] args) {
        EmployeeImpl employee = new EmployeeImpl();
        employee.work(); // Output: Employee is working
    }
}
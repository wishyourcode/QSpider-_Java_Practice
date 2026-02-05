package abstraction;

abstract class Employee {
    int a = 9; // variable by default is non-static and can be accessed by instance methods

    public void printThanks() {
        System.out.println("Thank you");
    }

    abstract void printEmployeeType();

    public abstract void calculateSalary();

    public static void companyPolicy() {
        System.out.println("Company Policy: Maintain professionalism at all times.");
    }

    Employee() {
        System.out.println("Employee Constructor Called");
    }

}

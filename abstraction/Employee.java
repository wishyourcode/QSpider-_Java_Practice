package abstraction;

abstract class Employee {
    int a = 9; // variable by default is non-static and can be accessed by instance methods

    public void printThanks() {
        System.out.println("Thank you belong to Employee parents class");
    }

    abstract void printEmployeeType();

    abstract int getEmployeeID(); // abstract method without body, to be implemented by child class with return
                                  // type int

    public abstract void calculateSalary();

    // public static abstract void abcd(); // static abstract method is not allowed
    // in Java, it will cause a compilation error
    public static void companyPolicy() {
        System.out.println("Company Policy: belong to parent class ");
    }

    Employee() {
        System.out.println("Employee Constructor Called");
    }

}

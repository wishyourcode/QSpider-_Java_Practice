package abstraction;

public class Implementation extends Employee {

    @Override
    public void printEmployeeType() {
        System.out.println("this is child class method whose body is provided in child class");
    }

    @Override
    public void calculateSalary() {
        System.out.println("Calculating salary for employee in child class");
    }

    @Override
    public void printThanks() {
        System.out.println("Thanks for being to child class");
    }

    @Override
    public int getEmployeeID() {
        return 12345; // Example employee ID
    }

}

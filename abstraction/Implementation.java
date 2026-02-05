package abstraction;

public class Implementation extends Employee {

    @Override
    void printEmployeeType() {
        System.out.println("This is a full-time employee.");
    }

    @Override
    public void calculateSalary() {
        System.out.println("Calculating salary for full-time employee.");
    }

    @Override
    public void printThanks() {
        System.out.println("Thanks for being a valuable employee!");
    }

}

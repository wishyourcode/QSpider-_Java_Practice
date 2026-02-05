package abstraction;

abstract class Employee {
    public void printThanks() {
        System.out.println("Thank you");
    }

    abstract void printEmployeeType();
}

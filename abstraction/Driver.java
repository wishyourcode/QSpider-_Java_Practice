package abstraction;

public class Driver {
    public static void main(String[] args) {
        // Employee emp = new Employee(); // This line would cause a compilation error
        // becouse we cannot create objbect of an abstract class
        // Accessing static method of abstract class
        Employee.companyPolicy();

        // Creating an instance of a concrete subclass
        Employee emp = new Implementation();
        emp.printThanks();
        emp.printEmployeeType();
        emp.calculateSalary();
    }
}

package searchelement;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class EmployeeDriver {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(11, "Piyush", "IT", 600000, "Google"));
        emp.add(new Employee(12, "Vishal", "IT", 600000, "Google"));
        emp.add(new Employee(13, "Vishu", "IT", 600000, "Google"));
        emp.add(new Employee(14, "Piyu", "IT", 600000, "Google"));
        emp.add(new Employee(15, "Vishhh", "IT", 600000, "Google"));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Employee Name to Search");
        String keyElement = input.nextLine();
        searchEmployee(emp, keyElement);
        input.close();
    }

    public static void searchEmployee(ArrayList<Employee> emp, String keyElement) {
        ListIterator<Employee> i = emp.listIterator();
        boolean isPresent = false;
        while (i.hasNext()) {
            Employee temp = i.next();
            if (temp.getEmpName().equalsIgnoreCase(keyElement)) {
                isPresent = true;
                System.out.println("Eployee with " + keyElement + " Found");
                System.out.println("ID of the Eployee is: " + temp.getEmpId());
                System.out.println("company of the Employee is: " + temp.getCompany());
                System.out.println("Department of the Employee is: " + temp.getDepartment());
                System.out.println("Salary od this Student is now: " + temp.getSalary());

            }
        }
        if (!isPresent) {
            System.out.println("Employee with " + keyElement + " is not found");
            System.out.println("Please Enter another Name");
        }
    }
}

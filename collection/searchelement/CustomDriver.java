package searchelement;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class CustomDriver {
    public static void main(String[] args) {
        ArrayList<UsingAttributes> emp = new ArrayList<>();
        emp.add(new UsingAttributes(101, "Vishal", 500000));
        emp.add(new UsingAttributes(102, "Piyush", 600000));
        emp.add(new UsingAttributes(103, "Mishra", 700000));
        emp.add(new UsingAttributes(104, "Vish", 800000));
        emp.add(new UsingAttributes(105, "Vishu", 900000));
        System.out.println(emp);

        System.out.println("=============================");
        ListIterator<UsingAttributes> E1 = emp.listIterator();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name to search");
        String KeyElements = input.nextLine();
        boolean isPresent = false;
        while (E1.hasNext()) {
            UsingAttributes temp = E1.next();
            if (temp.getname().equalsIgnoreCase(KeyElements)) {
                isPresent = true;
                System.out.println(KeyElements + " Details");
                System.out.println("Employee ID : " + temp.getid());
                System.out.println("Employee Salary : " + temp.getsalary());
            }
        }
        if (!isPresent) {
            System.out.println(KeyElements + "Is Invalid Employee Name");
            System.out.println("Enter valid Employee Name to check Employee details");
        }
        input.close();
    }
}

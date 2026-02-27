package searchelement;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class QspiderDriver {
    public static void main(String[] args) {
        ArrayList<Qspider> li = new ArrayList<>();
        li.add(new Qspider(101, "Vishal Mishra", "A24", "SLRTCE", 600000));
        li.add(new Qspider(102, "Shubham PAl", "A24", "SLRTCE", 600000));
        li.add(new Qspider(103, "Priyanshu Singh", "A24", "SLRTCE", 600000));
        li.add(new Qspider(104, "Gautam Shukla", "A24", "SLRTCE", 600000));
        li.add(new Qspider(105, "Rupesh", "A24", "SLRTCE", 600000));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Emp ID to Search");
        Integer keyElement = input.nextInt();
        searchStudent(li, keyElement);
        input.close();
    }

    public static void searchStudent(ArrayList<Qspider> li, int keyElement) {
        ListIterator<Qspider> i = li.listIterator();
        boolean isPresent = false;
        while (i.hasNext()) {
            Qspider temp = i.next();
            if (temp.getStdId() == keyElement) {
                isPresent = true;
                System.out.println("Student with " + keyElement + " Found");
                System.out.println("Name of the student is: " + temp.getName());
                System.out.println("College of the Student is: " + temp.getCollName());
                System.out.println("Batch of the Student is: " + temp.getBatch());
                System.out.println("Salary od this Student is now: " + temp.getSalary());
            }
        }
        if (!isPresent) {
            System.out.println("Student with " + keyElement + " Not found\n Please Enter currect Emp Id");
        }
    }

}

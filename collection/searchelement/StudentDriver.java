package collection.searchelement;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args) {
        ArrayList<Student> stu = new ArrayList<>();

        stu.add(new Student(101, "Piyush", "BE", 85.5, "Mumbai University"));
        stu.add(new Student(102, "Ankita", "BE", 88.2, "Pune University"));
        stu.add(new Student(103, "Vishal", "BE", 75.4, "Delhi University"));
        stu.add(new Student(104, "Vansh", "BE", 91.0, "Mumbai University"));
        stu.add(new Student(105, "Ayushree", "BE", 82.3, "Mumbai University"));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Student Name to Search");
        String keyElement = input.nextLine();

        searchStudent(stu, keyElement);
        input.close();
    }

    public static void searchStudent(ArrayList<Student> stu, String keyElement) {
        ListIterator<Student> i = stu.listIterator();
        boolean isPresent = false;

        while (i.hasNext()) {
            Student temp = i.next();

            if (temp.getName().equalsIgnoreCase(keyElement)) {
                isPresent = true;

                System.out.println("Student with " + keyElement + " Found");
                System.out.println("Roll No of the Student is: " + temp.getRollNo());
                System.out.println("Course of the Student is: " + temp.getCourse());
                System.out.println("Percentage of the Student is: " + temp.getPercentage());
                System.out.println("College of the Student is: " + temp.getCollege());
            }
        }

        if (!isPresent) {
            System.out.println("Student with " + keyElement + " is not found");
            System.out.println("Please Enter another Name");
        }
    }
}
package string;

public class Student {
    public static void main(String[] args) {
        String name = "Vishal Mishra";
        String name1 = "Vishal Mishra";
        String name2 = new String("Vishal Mishra");
        String name3 = new String("Vishal Mishra");
        System.out.println(name == name1); // true
        System.out.println(name == name2); // false
        System.out.println(name2 == name3); // false
        System.out.println(name.equals(name1)); // true
        System.out.println(name.equals(name2)); // true
        System.out.println(name2.equals(name3)); // true

    }
}

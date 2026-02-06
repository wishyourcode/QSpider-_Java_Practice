package object_class;

public class getclassExample {
    public static void main(String[] args) {
        Demo d = new Demo();
        // getClass method is used to get the class of an object
        // format: class package_name.class_name
        // getName method is used to get the name of the class
        // format: package_name.class_name
        System.out.println(d.getClass());
        System.out.println(d.getClass().getName());
    }
}

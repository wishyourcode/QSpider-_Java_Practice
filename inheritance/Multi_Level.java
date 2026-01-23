package inheritance;

class GrandParent {
    String name = "Vidhyapati Mishra";
    int age = 82;
}

class Father extends GrandParent {
    String name = "Manoj Mishra";
    int age = 50;
    String grandParentName = super.name;
    int grandParentAge = super.age;
}

class me extends Father {
    String name = "Vishal Mishra";
    int age = 22;

    public void show() {
        System.out.println("GrandFather Name: " + super.grandParentName);
        System.out.println("GrandFather Age: " + super.grandParentAge);
        System.out.println("Father Name: " + super.name);
        System.out.println("Father Age: " + super.age);
        System.out.println("My Name: " + this.name);
        System.out.println("My Age: " + this.age);
    }
}

public class Multi_Level {
    public static void main(String[] args) {
        me obj = new me();
        obj.show();
    }

}

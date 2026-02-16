package encapsulation;

public class PrivateConstructor {
    private int id;
    private String Name;
    private int rollno;

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setId(int id) {
        this.id = id;
    }

    private PrivateConstructor(int id, String Name, int rollno) {
        this.id = id;
        this.Name = Name;
        this.rollno = rollno;
    }

    public static PrivateConstructor createObj(int id, String Name, int rollno) {
        return new PrivateConstructor(id, Name, rollno);
    }

    public static void main(String[] args) {
        PrivateConstructor p1 = PrivateConstructor.createObj(1, "Vishal", 5);
        System.out.println("Id: " + p1.getId());
        System.out.println("Name: " + p1.getName());
        System.out.println("Roll No: " + p1.getRollno());

        PrivateConstructor p2 = PrivateConstructor.createObj(2, "Gautam", 10);
        System.out.println("Id: " + p2.getId());
        System.out.println("Name: " + p2.getName());
        System.out.println("Roll No: " + p2.getRollno());
    }

}

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

    PrivateConstructor p1 = PrivateConstructor.createObj(1, "Vishal", 5);

}

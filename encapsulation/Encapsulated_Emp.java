package encapsulation;

public class Encapsulated_Emp {
    private String name;
    private double salary;
    private int id;
    private String department;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public double getsalary() {
        return salary;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getdepartment() {
        return department;
    }

    public void setdepartment(String department) {
        this.department = department;
    }

    public void display() {
        System.out.println(getid());
        System.out.println(getname());
        System.out.println(getsalary());
        System.out.println(getdepartment());
    }
}

class InnerEmployee {

    public static void main(String[] args) {
        Encapsulated_Emp E1 = new Encapsulated_Emp();
        E1.setid(1);
        E1.setname("Vishal");
        E1.setsalary(69000);
        E1.setdepartment("IT");
        E1.display();
    }
}

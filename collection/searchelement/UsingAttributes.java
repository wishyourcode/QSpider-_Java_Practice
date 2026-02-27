package searchelement;

public class UsingAttributes {
    private int id;
    private String name;
    private int Salary;

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public int getsalary() {
        return Salary;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setsalary(int salary) {
        this.Salary = salary;
    }

    UsingAttributes(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.Salary = salary;
    }

    public String toString() {
        return "Employee Id is: " + id + "\nEmployee name is: " + name + "\nEmployee salary is: " + Salary + "\n";
    }

    public boolean equals(Object obj) {
        UsingAttributes Employee = (UsingAttributes) obj;
        if (this.id == Employee.id && this.name.equalsIgnoreCase(Employee.name) && this.Salary == Employee.Salary) {
            return true;
        }
        return false;
    }
}

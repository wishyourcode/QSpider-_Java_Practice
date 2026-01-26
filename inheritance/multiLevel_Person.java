package inheritance;

class person {
    private String name;
    private int age;

    person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("name of the person is : " + name);
        System.out.println("Age of the person is : " + age);
    }
}

class Employee extends person {
    private int empId;
    private String Name;

    Employee(String name, int age, int empId, String Name) {
        super(name, age);
        this.empId = empId;
        this.Name = Name;
    }

    public void getEmpInfo() {
        getInfo();
        System.out.println("Employee ID is : " + empId);
        System.out.println("Name of the Employee is : " + Name);
    }
}

class Manager extends Employee {
    private String department;

    Manager(String name, int age, int empId, String Name, String department) {
        super(name, age, empId, Name);
        this.department = department;
    }

    public void ManagerInfo() {
        getEmpInfo();
        System.out.println("Department of the person is : " + department);
    }
}

public class multiLevel_Person {
    public static void main(String[] args) {
        Manager m1 = new Manager("Vishal", 23, 108, "Piyush", "IT");
        m1.ManagerInfo();
    }
}

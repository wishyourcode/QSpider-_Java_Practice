package relationship;

public class Company {
    private String cmpName;
    private int empCount;

    public String getcpmName() {
        return cmpName;
    }

    public void setname(String cmpName) {
        this.cmpName = cmpName;
    }

    public int getempCount() {
        return empCount;
    }

    public void setempCount(int empCount) {
        this.empCount = empCount;
    }

    Company(String cmpName, int empCount) {
        this.cmpName = cmpName;
        this.empCount = empCount;
    }

    public void displayCpm() {
        System.out.println("Name of the Company is :" + cmpName);
        System.out.println("There are " + empCount + " Employee in the Company");
    }

    // engine object creation early instiatiation
    Employee E1 = new Employee("VIshal Mishra", 690000);
}

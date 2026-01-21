package relationship;

public class CompanyDriver {
    public static void main(String[] args) {
        Company C1 = new Company("Microsoft", 20000);
        C1.displayCpm();
        C1.setname("Google");
        System.out.println(C1.getcpmName());
        C1.displayCpm();
        System.out.println(C1.E1.getname());
        C1.E1.setsalary(0);
        C1.E1.setsalary(99000).displayEmp();
    }
}

package relationship;

public class HospitalDriver {
    public static void main(String[] args) {
        Hospital H1 = new Hospital("BhaktiVedant", "Mira road");
        H1.displayHospital();
        H1.sethospitalName("Wockhardt");
        System.out.println(H1.gethospitalName());
        H1.displayHospital();
        H1.setpatient(new Patient("Mukesh", 42));
        System.out.println(H1.getpatient().getname());
        H1.getpatient().setage(45).displayPatient();
    }
}

package relationship;

public class Hospital {
    private String hospitalName;
    private String location;
    private Patient patient;

    public String gethospitalName() {
        return hospitalName;
    }

    public String getlocation() {
        return location;
    }

    public void sethospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Patient setlocation(String location) {
        this.location = location;
        return patient;
    }

    Hospital(String hospitalName, String location) {
        this.hospitalName = hospitalName;
        this.location = location;
    }

    public void displayHospital() {
        System.out.println("Hospital Name : " + hospitalName);
        System.out.println("Hospital Location : " + location);
    }

    public Patient getpatient() {
        return patient;
    }

    public void setpatient(Patient patient) {
        this.patient = patient;
    }
}

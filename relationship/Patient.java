package relationship;

public class Patient {
    private String name;
    private int age;

    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }

    public void setname(String name) {
        this.name = name;
    }

    public Patient setage(int age) {
        this.age = age;
        return this;
    }

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPatient() {
        System.out.println("Patient Name : " + name);
        System.out.println("Patient Age : " + age);
    }
}

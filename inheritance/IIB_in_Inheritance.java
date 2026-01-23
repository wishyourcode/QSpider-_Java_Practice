package inheritance;

class Doctor {
    String name = "Dr. Smith";
    String specialization = "Cardiology";
    {
        System.out.println("Doctor Name: " + name);
        System.out.println("Specialization: " + specialization);
    }
}

class Surgeon extends Doctor {
    String surgeryType = "Heart Surgery";
    {
        System.out.println("Surgery Type: " + surgeryType);
    }
}

public class IIB_in_Inheritance {
    public static void main(String[] args) {
        new Doctor();
        System.out.println("-----");
        new Surgeon();
    }
}

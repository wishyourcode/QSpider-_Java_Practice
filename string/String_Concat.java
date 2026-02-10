package string;

public class String_Concat {
    public static void main(String[] args) {
        String name = "Radhe";
        String surname = "Radhe";
        String greeting = name.concat(" ").concat(surname);
        System.out.println("Concatenated String: " + greeting);
    }
}

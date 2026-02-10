package string;

public class String_Trim {
    public static void main(String[] args) {
        String name = "    Radhe Radhe     ";
        System.out.println("Original string: '" + name + "'");
        String trimmedName = name.trim();
        System.out.println("Trimmed string: '" + trimmedName + "'");
    }
}

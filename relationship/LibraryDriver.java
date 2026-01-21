package relationship;

public class LibraryDriver {
    public static void main(String[] args) {
        Library lib = new Library("College Library", "Mira road");
        lib.displayLibrary();
        lib.setlibraryName("School Library");
        System.out.println(lib.getlibraryName());
        lib.displayLibrary();
        lib.setbook(new Book("java", "Unknown"));
        System.out.println(lib.getbook().gettitle());
        lib.getbook().setauthor("Vishal").displayBook();
    }
}

package relationship;

public class Library {
    private String libraryName;
    private String location;
    private Book book;

    public String getlibraryName() {
        return libraryName;
    }

    public String getlocation() {
        return location;
    }

    public void setlibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public Library setlocation(String location) {
        this.location = location;
        return this;
    }

    Library(String libraryName, String location) {
        this.libraryName = libraryName;
        this.location = location;
    }

    public void displayLibrary() {
        System.out.println("Library Name : " + libraryName);
        System.out.println("Library Location : " + location);
    }

    public Book getbook() {
        return book;
    }

    public void setbook(Book book) {
        this.book = book;
    }
}

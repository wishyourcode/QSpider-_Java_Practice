package relationship;

public class Book {
    private String title;
    private String author;

    public String gettitle() {
        return title;
    }

    public String getauthor() {
        return author;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public Book setauthor(String author) {
        this.author = author;
        return this;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Book Title : " + title);
        System.out.println("Book Author : " + author);
    }
}

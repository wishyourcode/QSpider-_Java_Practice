package encapsulation;

public class Book {
    private String title;
    private String auther;
    private double price;
    private int pages;
    private String publisher;

    public String gettitle() {
        return title;
    }

    public String getauther() {
        return auther;
    }

    public double getprice() {
        return price;
    }

    public int getpages() {
        return pages;
    }

    public String getpublisher() {
        return publisher;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public void setauther(String auther) {
        this.auther = auther;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public void settitle(int pages) {
        this.pages = pages;
    }

    public void setpublisher(String publisher) {
        this.publisher = publisher;
    }
}

class Driver {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.settitle("Power of subconcious mind");
        System.out.println(b1.gettitle());
    }
}

package relationship;

public class Flipkart {
    private String productName;
    private double price;

    public String getproductName() {
        return productName;
    }

    public double getprice() {
        return price;
    }

    public void setproductName(String productName) {
        this.productName = productName;
    }

    public Flipkart setprice(double price) {
        this.price = price;
        return this;
    }

    Flipkart(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
    }

    Customer customer = new Customer("Vishal", "vishalm3101@gmail.com");
}

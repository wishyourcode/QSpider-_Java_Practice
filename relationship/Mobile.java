package relationship;

public class Mobile {
    private String brand;
    private double price;

    public String getbrand() {
        return brand;
    }

    public double getprice() {
        return price;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public Mobile setprice(double price) {
        this.price = price;
        return this;
    }

    Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void displayMobile() {
        System.out.println("Mobile Brand : " + brand);
        System.out.println("Mobile Price : " + price);
    }

    Battery B1 = new Battery("LG", 4000);

}

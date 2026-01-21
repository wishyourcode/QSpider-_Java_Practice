package relationship;

public class Keyboard {
    private String brand;
    private int price;

    public String getbrand() {
        return brand;
    }

    public int getprice() {
        return price;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public Keyboard setprice(int price) {
        this.price = price;
        return this;
    }

    Keyboard(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void DisplayKeyboard() {
        System.out.println("Keyboard Brand : " + brand);
        System.out.println("Keyboard Price : " + price);
    }
}

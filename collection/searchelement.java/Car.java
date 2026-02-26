import java.util.Objects;

public class Car {

    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;

    public Car(String model, String brand, int year, double price, String color) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Model: " + model +
                "\nBrand: " + brand +
                "\nYear: " + year +
                "\nPrice: " + price +
                "\nColor: " + color + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Car c = (Car) obj;
        return year == c.year &&
                Double.compare(c.price, price) == 0 &&
                Objects.equals(model, c.model) &&
                Objects.equals(brand, c.brand) &&
                Objects.equals(color, c.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, brand, year, price, color);
    }
}
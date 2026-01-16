package encapsulation;

public class Car {
    private String brand;
    private double price;
    private String fuelType;
    private String model;
    private int buildYear;

    public String getbrand() {
        return brand;
    }

    public double getprice() {
        return price;
    }

    public String getfuelType() {
        return fuelType;
    }

    public String getmodel() {
        return model;
    }

    public int getbuildYear() {
        return buildYear;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public void setmodel(String model) {
        this.model = model;
    }

    public void setfuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public void setbuildYear(int buildYear) {
        this.buildYear = buildYear;
    }
}

class Driver {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setbrand("rolls royal");
        System.out.println(c1.getbrand());

    }
}

package searchelement;

import java.util.Objects;

public class Product {

    private int productId;
    private String productName;
    private double price;
    private String brand;
    private int quantity;

    public Product(int productId, String productName, double price, String brand, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product Id: " + productId +
                "\nProduct Name: " + productName +
                "\nPrice: " + price +
                "\nBrand: " + brand +
                "\nQuantity: " + quantity + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Product p = (Product) obj;
        return productId == p.productId &&
                Double.compare(p.price, price) == 0 &&
                quantity == p.quantity &&
                Objects.equals(productName, p.productName) &&
                Objects.equals(brand, p.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, price, brand, quantity);
    }
}
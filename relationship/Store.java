package relationship;

public class Store {
    private String name;
    private String location;
    private Product product;

    public Store(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    Store(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void displayStore() {
        System.out.println(name);
        System.out.println(location);
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

}

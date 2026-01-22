package relationship;

public class StoreDriver {
    public static void main(String[] args) {
        Store store = new Store("LAla", "MiraRoad");
        store.displayStore();
        store.setLocation("vasai");
        store.getLocation();
        store.setProduct(new Product("Toy", 100));
        store.getProduct().displayProduct();
    }
}

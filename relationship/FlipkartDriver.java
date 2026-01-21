package relationship;

public class FlipkartDriver {
    public static void main(String[] args) {
        Flipkart F1 = new Flipkart("Phone", 1000);
        F1.displayProduct();
        F1.setproductName("Laptop");
        System.out.println(F1.getproductName());
        F1.setprice(100000);
        F1.displayProduct();
        System.out.println(F1.customer.getname());
        F1.customer.getname();
        F1.customer.setemail("piyush@gmail.com").displayCustomer();
    }
}

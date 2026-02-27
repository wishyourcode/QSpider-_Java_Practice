package searchelement;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ProductDriver {
    public static void main(String[] args) {

        ArrayList<Product> productList = new ArrayList<>();

        productList.add(new Product(101, "Laptop", 65000.0, "Dell", 10));
        productList.add(new Product(102, "Mobile", 25000.0, "Samsung", 20));
        productList.add(new Product(103, "Headphones", 3000.0, "Sony", 15));
        productList.add(new Product(104, "Tablet", 40000.0, "Apple", 8));
        productList.add(new Product(105, "Smartwatch", 15000.0, "Boat", 25));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Product Name to Search");
        String keyProduct = input.nextLine();

        searchProduct(productList, keyProduct);
        input.close();
    }

    public static void searchProduct(ArrayList<Product> productList, String keyProduct) {

        ListIterator<Product> i = productList.listIterator();
        boolean isPresent = false;

        while (i.hasNext()) {
            Product temp = i.next();

            if (temp.getProductName().equalsIgnoreCase(keyProduct)) {
                isPresent = true;

                System.out.println("Product with name " + keyProduct + " Found");
                System.out.println("Product ID: " + temp.getProductId());
                System.out.println("Brand: " + temp.getBrand());
                System.out.println("Price: " + temp.getPrice());
                System.out.println("Quantity Available: " + temp.getQuantity());
            }
        }

        if (!isPresent) {
            System.out.println("Product with name " + keyProduct + " is not found");
            System.out.println("Please Enter another Product Name");
        }
    }
}
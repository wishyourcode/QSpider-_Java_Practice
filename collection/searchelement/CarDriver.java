package collection.searchelement;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class CarDriver {
    public static void main(String[] args) {

        ArrayList<Car> carList = new ArrayList<>();

        carList.add(new Car("Model S", "Tesla", 2022, 7500000.0, "Red"));
        carList.add(new Car("Civic", "Honda", 2020, 1500000.0, "White"));
        carList.add(new Car("Creta", "Hyundai", 2021, 1800000.0, "Black"));
        carList.add(new Car("Swift", "Maruti", 2019, 800000.0, "Blue"));
        carList.add(new Car("Fortuner", "Toyota", 2023, 4200000.0, "Silver"));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Car Model to Search");
        String keyModel = input.nextLine();

        searchCar(carList, keyModel);
        input.close();
    }

    public static void searchCar(ArrayList<Car> carList, String keyModel) {

        ListIterator<Car> i = carList.listIterator();
        boolean isPresent = false;

        while (i.hasNext()) {
            Car temp = i.next();

            if (temp.getModel().equalsIgnoreCase(keyModel)) {
                isPresent = true;

                System.out.println("Car with Model " + keyModel + " Found");
                System.out.println("Brand: " + temp.getBrand());
                System.out.println("Year: " + temp.getYear());
                System.out.println("Price: " + temp.getPrice());
                System.out.println("Color: " + temp.getColor());
            }
        }

        if (!isPresent) {
            System.out.println("Car with Model " + keyModel + " is not found");
            System.out.println("Please Enter another Model");
        }
    }
}
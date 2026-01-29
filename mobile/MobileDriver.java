package mobile;

import java.util.Scanner;

public class MobileDriver {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Iphone iphone = null;
        Samsung s1 = null;
        Oppo o1 = null;
        Vivo v1 = null;
        String brand = initiatizer();
        brand = brand.toUpperCase();
        switch (brand) {
            case "IPHONE": {
                iphone = m1.storeRef(new Iphone());
                iphone.PrintThank();
                String model = IphoneInitializer();
                System.out.println(model);
                break;
            }
            case "SAMSUNG": {
                s1 = m1.storeRef(new Samsung());
                s1.PrintThank();
                break;

            }
            case "OPPO": {
                o1 = m1.storeRef(new Oppo());
                o1.PrintThank();
                break;

            }
            case "VIVO": {
                v1 = m1.storeRef(new Vivo());
                v1.PrintThank();
                break;

            }
            default: {
                System.err.println("Please Type Correct Mobile Type");
            }
        }
    }

    public static String initiatizer() {
        System.out.println("====================================");
        System.out.println("=== Welcome to Vijay Sales ====");
        System.out.println("====================================");
        System.out.println("Type Iphone for shoping with Iphone");
        System.out.println("Type Samsang for shoping with Samsung");
        System.out.println("Type Vivo for shoping with Vivo");
        System.out.println("Type Oppo for shoping with Oppo");
        System.out.print("Please Type your choice: ");
        Scanner input = new Scanner(System.in);
        String brand = input.next();
        return brand;

    }

    public static String IphoneInitializer() {
        System.out.println("====================================");
        System.out.println("=== Welcome to Iphone Section ====");
        System.out.println("====================================");
        System.out.println("Type Iphone 13 for shoping with Iphone 13");
        System.out.println("Type Iphone 15 for shoping with Iphone 15");
        System.out.println("Type Iphone 17 for shoping with Iphone 17");
        System.out.print("Please Type your choice: ");
        Scanner input = new Scanner(System.in);
        String model = input.nextLine();
        return model;
    }

    public static String SamsungInitializer() {
        System.out.println("====================================");
        System.out.println("=== Welcome to Iphone Section ====");
        System.out.println("====================================");
        System.out.println("Type Iphone 13 for shoping with Iphone 13");
        System.out.println("Type Iphone 15 for shoping with Iphone 15");
        System.out.println("Type Iphone 17 for shoping with Iphone 17");
        System.out.print("Please Type your choice: ");
        Scanner input = new Scanner(System.in);
        String model = input.nextLine();
        return model;
    }

    public static String OppoInitializer() {
        System.out.println("====================================");
        System.out.println("=== Welcome to Iphone Section ====");
        System.out.println("====================================");
        System.out.println("Type Iphone 13 for shoping with Iphone 13");
        System.out.println("Type Iphone 15 for shoping with Iphone 15");
        System.out.println("Type Iphone 17 for shoping with Iphone 17");
        System.out.print("Please Type your choice: ");
        Scanner input = new Scanner(System.in);
        String model = input.nextLine();
        return model;
    }

    public static String VivoInitializer() {
        System.out.println("====================================");
        System.out.println("=== Welcome to Iphone Section ====");
        System.out.println("====================================");
        System.out.println("Type Iphone 13 for shoping with Iphone 13");
        System.out.println("Type Iphone 15 for shoping with Iphone 15");
        System.out.println("Type Iphone 17 for shoping with Iphone 17");
        System.out.print("Please Type your choice: ");
        Scanner input = new Scanner(System.in);
        String model = input.nextLine();
        return model;
    }
}

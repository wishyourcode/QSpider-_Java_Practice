package ola_cab;

import java.util.Scanner;

public class OLADriver {
    public static void main(String[] args) {
        OLA ola = new OLA();
        Cab c1 = null;
        while (c1 == null) {
            int choice = Initializer();
            switch (choice) {
                case 1: {
                    c1 = ola.storeCabRef(new Mini());
                    c1.printThanks();
                    break;
                }
                case 2: {
                    c1 = ola.storeCabRef(new Sedan());
                    c1.printThanks();
                    break;
                }
                case 3: {
                    c1 = ola.storeCabRef(new luxury());
                    c1.printThanks();
                    break;
                }
                default: {
                    System.err.println("Please Enter Currect Key");
                }
            }
        }
    }

    public static int Initializer() {
        Scanner input = new Scanner(System.in);
        System.out.println("====== Welcome to OLA ======");
        System.out.println("Press 1 : for the Mini car Booking");
        System.out.println("Press 2 : for the Sedan car Booking");
        System.out.println("Press 3 : for the Luxury car Booking");
        System.out.println("Please Enter your choice");
        int choice = input.nextInt();
        System.out.println(choice);
        return choice;
    }
}

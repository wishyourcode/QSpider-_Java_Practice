package mobile;

import java.util.Scanner;

public class MobileDriver {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Iphone iphone = null;
        Samsung samsung = null;
        Oppo oppo = null;
        boolean isPurchased = false;
        while (!isPurchased) {
            String brand = initiatizer().toUpperCase();
            switch (brand) {
                case "IPHONE": {
                    while (iphone == null) {
                        int model = IphoneInitializer();
                        switch (model) {
                            case 1:
                                iphone = m1.storeRef(new Iphone_13());
                                break;
                            case 2:
                                iphone = m1.storeRef(new Iphone_15());
                                break;
                            case 3:
                                iphone = m1.storeRef(new Iphone_17());
                                break;
                            default:
                                System.err.println("Invalid Iphone Model Please Try Again");
                        }
                    }
                    iphone.PrintThank();
                    isPurchased = true;
                    break;
                }
                case "SAMSUNG": {
                    while (samsung == null) {
                        int model = SamsungInitializer();
                        switch (model) {
                            case 1:
                                samsung = m1.storeRef(new Samsung_23());
                                break;
                            case 2:
                                samsung = m1.storeRef(new Samsung_24());
                                break;
                            case 3:
                                samsung = m1.storeRef(new Samsung_25());
                                break;
                            default:
                                System.err.println("Invalid Samsung Model Please Try Again");
                        }
                    }
                    samsung.PrintThank();
                    isPurchased = true;
                    break;
                }

                case "OPPO": {
                    while (oppo == null) {
                        int model = OppoInitializer();
                        switch (model) {
                            case 1:
                                oppo = m1.storeRef(new Reno_7());
                                break;
                            case 2:
                                oppo = m1.storeRef(new Reno_8());
                                break;
                            case 3:
                                oppo = m1.storeRef(new Reno_9());
                                break;
                            default:
                                System.err.println("Invalid Oppo Model Please Try Again");
                        }
                    }

                    oppo.PrintThank();
                    isPurchased = true;
                    break;
                }

                case "VIVO": {
                    Vivo vivo = null;

                    while (vivo == null) {
                        int model = VivoInitializer();

                        switch (model) {
                            case 1:
                                vivo = m1.storeRef(new Vivo_T1());
                                break;
                            case 2:
                                vivo = m1.storeRef(new Vivo_V_plus());
                                break;
                            case 3:
                                vivo = m1.storeRef(new Vivo200());
                                break;
                            default:
                                System.err.println("Invalid Vivo Model Please Try Again");
                        }
                    }
                    vivo.PrintThank();
                    isPurchased = true;
                    break;
                }
                default:
                    System.err.println("Invalid Brand Please Try Again");
            }
        }
    }

    public static String initiatizer() {
        System.out.println("====================================");
        System.out.println("=== Welcome to Vijay Sales ====");
        System.out.println("====================================");
        System.out.println("Type Iphone for Iphone");
        System.out.println("Type Samsung for Samsung");
        System.out.println("Type Vivo for Vivo");
        System.out.println("Type Oppo for Oppo");
        System.out.print("Please Type your choice: ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    public static int IphoneInitializer() {
        System.out.println("Press 1: Iphone 13");
        System.out.println("Press 2: Iphone 15");
        System.out.println("Press 3: Iphone 17");
        System.out.print("Please Type your choice: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int SamsungInitializer() {
        System.out.println("Press 1: Samsung 23");
        System.out.println("Press 2: Samsung 24");
        System.out.println("Press 3: Samsung 25");
        System.out.print("Please Type your choice:");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int OppoInitializer() {
        System.out.println("Press 1: Oppo Reno 7");
        System.out.println("Press 2: Oppo Reno 8");
        System.out.println("Press 3: Oppo Reno 9");
        System.out.print("Please Type your choice:");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int VivoInitializer() {
        System.out.println("Press 1: Vivo T1");
        System.out.println("Press 2: Vivo V Plus");
        System.out.println("Press 3: Vivo 2000");
        System.out.print("Please Type your choice:");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}

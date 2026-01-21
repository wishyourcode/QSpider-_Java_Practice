package relationship;

public class MobileDriver {
    public static void main(String[] args) {
        Mobile M1 = new Mobile("Samsung", 40000);
        M1.displayMobile();
        M1.setbrand("Apple");
        System.out.println(M1.getbrand());
        M1.setprice(129000.00);
        M1.displayMobile();
        M1.B1.getcapacity();
        M1.B1.setcapacity(6000).displayBattery();

    }
}

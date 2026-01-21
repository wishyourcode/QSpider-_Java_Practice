package relationship;

public class HouseDriver {
    public static void main(String[] args) {
        House house = new House(2, 40000000);
        house.displayHouse();
        house.setnoOfRooms(3);
        System.out.println(house.getnoOfRooms());
        house.setprice(45000000).displayHouse();
        house.setaddress(new Address("Maharatshra", "Thane"));
        house.getaddress().setcity("Mumbai").displayAddress();

    }
}

package relationship;

public class House {
    private int noOfRooms;
    private int price;
    private Address address;

    public int getnoOfRooms() {
        return noOfRooms;
    }

    public int getprice() {
        return price;
    }

    public void setnoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public House setprice(int price) {
        this.price = price;
        return this;
    }

    House(int noOfRooms, int price) {
        this.noOfRooms = noOfRooms;
        this.price = price;
    }

    public void displayHouse() {
        System.out.println("Number of Rooms : " + noOfRooms);
        System.out.println("House Price : " + price);
    }

    public Address getaddress() {
        return address;
    }

    public void setaddress(Address address) {
        this.address = address;
    }

}
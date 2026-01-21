package relationship;

public class Battery {
    private String type;
    private int capacity;

    public String gettype() {
        return type;
    }

    public int getcapacity() {
        return capacity;
    }

    public void settype(String type) {
        this.type = type;
    }

    public Battery setcapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    Battery(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public void displayBattery() {
        System.out.println("Battery Type : " + type);
        System.out.println("Battery Capacity : " + capacity);
    }
}

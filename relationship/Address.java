package relationship;

public class Address {
    private String state;
    private String city;

    public String getstate() {
        return state;
    }

    public String getcity() {
        return city;
    }

    public void setstate(String state) {
        this.state = state;
    }

    public Address setcity(String city) {
        this.city = city;
        return this;
    }

    Address(String state, String city) {
        this.state = state;
        this.city = city;
    }

    public void displayAddress() {
        System.out.println("State : " + state);
        System.out.println("City : " + city);
    }
}

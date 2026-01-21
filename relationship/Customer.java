package relationship;

public class Customer {
    private String name;
    private String email;

    public String getname() {
        return name;
    }

    public String getemail() {
        return email;
    }

    public void setname(String name) {
        this.name = name;
    }

    public Customer setemail(String email) {
        this.email = email;
        return this;
    }

    Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void displayCustomer() {
        System.out.println("Customer Name : " + name);
        System.out.println("Customer Email : " + email);
    }

}

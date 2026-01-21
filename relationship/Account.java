package relationship;

public class Account {
    private String accountHolderName;
    private double balance;

    public String getaccountHolderName() {
        return accountHolderName;
    }

    public double getbalance() {
        return balance;
    }

    public void setaccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Account setbalance(double balance) {
        this.balance = balance;
        return this;
    }

    Account(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void displayAccount() {
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Balance : " + balance);
    }
}

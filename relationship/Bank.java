package relationship;

public class Bank {
    private String bankName;
    private String branch;

    public String getbankName() {
        return bankName;
    }

    public void setbankName(String bankName) {
        this.bankName = bankName;
    }

    public String getbranch() {
        return branch;
    }

    public void setbranch(String branch) {
        this.branch = branch;
    }

    Bank(String bankName, String branch) {
        this.bankName = bankName;
        this.branch = branch;
    }

    public void displayBank() {
        System.out.println("Bank Name : " + bankName);
        System.out.println("Branch Name : " + branch);
    }

    Account A1 = new Account("Vishal Mishra", 100000.00);
}

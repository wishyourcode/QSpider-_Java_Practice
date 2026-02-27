package searchelement;

import java.util.Objects;

public class BankAccount {

    private long accountNumber;
    private String holderName;
    private String bankName;
    private double balance;
    private String branch;

    public BankAccount(long accountNumber, String holderName, String bankName, double balance, String branch) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.bankName = bankName;
        this.balance = balance;
        this.branch = branch;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                "\nHolder Name: " + holderName +
                "\nBank Name: " + bankName +
                "\nBalance: " + balance +
                "\nBranch: " + branch + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        BankAccount b = (BankAccount) obj;
        return accountNumber == b.accountNumber &&
                Double.compare(b.balance, balance) == 0 &&
                Objects.equals(holderName, b.holderName) &&
                Objects.equals(bankName, b.bankName) &&
                Objects.equals(branch, b.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, holderName, bankName, balance, branch);
    }
}
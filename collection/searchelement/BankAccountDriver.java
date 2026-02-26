package collection.searchelement;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class BankAccountDriver {
    public static void main(String[] args) {

        ArrayList<BankAccount> acc = new ArrayList<>();

        acc.add(new BankAccount(100001L, "Vishal", "HDFC", 50000.0, "Mumbai"));
        acc.add(new BankAccount(100002L, "Piyush", "ICICI", 75000.0, "Pune"));
        acc.add(new BankAccount(100003L, "Vishal", "SBI", 62000.0, "Delhi"));
        acc.add(new BankAccount(100004L, "Piyush", "Axis", 88000.0, "Mumbai"));
        acc.add(new BankAccount(100005L, "Ankita", "Kotak", 91000.0, "Mumbai"));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Account Number to Search");
        long keyAccountNumber = input.nextLong();

        searchAccount(acc, keyAccountNumber);
        input.close();
    }

    public static void searchAccount(ArrayList<BankAccount> acc, long keyAccountNumber) {

        ListIterator<BankAccount> i = acc.listIterator();
        boolean isPresent = false;

        while (i.hasNext()) {
            BankAccount temp = i.next();

            if (temp.getAccountNumber() == keyAccountNumber) {
                isPresent = true;

                System.out.println("Account with Account Number " + keyAccountNumber + " Found");
                System.out.println("Account Holder Name: " + temp.getHolderName());
                System.out.println("Bank Name: " + temp.getBankName());
                System.out.println("Balance: " + temp.getBalance());
                System.out.println("Branch: " + temp.getBranch());
            }
        }

        if (!isPresent) {
            System.out.println("Account with Account Number " + keyAccountNumber + " is not found");
            System.out.println("Please Enter another Account Number");
        }
    }
}
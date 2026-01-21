package relationship;

public class BankDriver {
    public static void main(String[] args) {
        Bank B1 = new Bank("SBI", "Bhayandar");
        B1.displayBank();
        B1.setbankName("HDFC");
        System.out.println(B1.getbankName());
        B1.displayBank();
        System.out.println(B1.A1.getaccountHolderName());
        B1.A1.setbalance(50000.00);
        B1.A1.setbalance(150000.00).displayAccount();

    }
}

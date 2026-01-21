package relationship;

public class PCDriver {
    public static void main(String[] args) {
        PC pc1 = new PC("Asus", "intel i5");
        pc1.displayPC();
        pc1.setbrand("ROG");
        System.out.println(pc1.getbrand());
        pc1.setprocessor("Intel i7");
        pc1.displayPC();
        pc1.setkeyboard(new Keyboard("Asus", 150));
        pc1.getkeyboard().setprice(200).DisplayKeyboard();

    }
}

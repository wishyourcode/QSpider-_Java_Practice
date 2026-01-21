package relationship;

public class PC {
    private String brand;
    private String processor;
    private Keyboard keyboard;

    public String getbrand() {
        return brand;
    }

    public String getprocessor() {
        return processor;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public PC setprocessor(String processor) {
        this.processor = processor;
        return this;
    }

    PC(String brand, String processor) {
        this.brand = brand;
        this.processor = processor;
    }

    public void displayPC() {
        System.out.println("PC Brand : " + brand);
        System.out.println("PC Processor : " + processor);
    }

    public Keyboard getkeyboard() {
        return keyboard;
    }

    public void setkeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}

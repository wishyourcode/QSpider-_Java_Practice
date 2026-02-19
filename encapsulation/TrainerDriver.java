package encapsulation;

public class TrainerDriver {
    public static void main(String[] args) {
        Trainer t1 = Trainer.createObj(0, "Vishal", "Java");
        Trainer t2 = Trainer.createObj(1, "Piyush", "Java");
        Trainer t3 = Trainer.createObj(2, "Ankit", "C++");
        t1.DisplayProperty();
        t2.DisplayProperty();
        t3.DisplayProperty();

    }
}

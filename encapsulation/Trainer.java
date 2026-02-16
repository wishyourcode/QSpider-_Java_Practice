package encapsulation;

public class Trainer {
    private int id;
    private String name;
    private String subject;
    private Trainer trainer;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private Trainer(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public static Trainer createObj(int id, String name, String subject) {
        return new Trainer(id, name, subject);
    }
}

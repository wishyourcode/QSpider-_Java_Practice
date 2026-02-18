public class MethodChainong {
    private int id;
    private String name;
    private int age;

    public MethodChainong setId(int id) {
        this.id = id;
        return this;
    }

    public MethodChainong setAge(int age) {
        this.age = age;
        return this;
    }

    public MethodChainong setName(String name) {
        this.name = name;
        return this;
    }

    MethodChainong() {
        System.out.println("Constructor is called");
    }

    MethodChainong(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        MethodChainong m1 = new MethodChainong(4, "Vishal");
        m1.setId(1).setName("Vishal").setAge(24);
        System.out.println("Id: " + m1.getId());
        System.out.println("Name: " + m1.getName());
        System.out.println("Age: " + m1.getAge());

    }

}

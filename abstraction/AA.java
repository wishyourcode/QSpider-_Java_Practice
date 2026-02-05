package abstraction;

interface AA {
    public static void vishal() {
        System.out.println("This is AA class method");
    }
}

class AB implements AA {
    public static void main(String[] args) {
        AA.vishal(); // Accessing the static method of the interface using the interface name
        AB obj = new AB();
        AA.vishal(); // Accessing the static method of the interface using the interface name
        // obj.vishal(); // Accessing the static method of the interface
        // using the object reference couse error because static method
        // cannot be accessed by object reference
    }
}

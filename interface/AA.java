
interface AA {
    public static void vishal() {
        System.out.println("This is AA class method");
    }
}

class AB implements AA {
    public void print() {
        System.out.println("This is AB class method");
    }

    public static void main(String[] args) {
        AB obj = new AB();
        obj.print(); // Accessing the static method of the AB class using the object reference
        AA.vishal(); // Accessing the static method of the interface using the interface name
        // obj.vishal(); // Accessing the static method of the interface
        // using the object reference couse error because static method
        // cannot be accessed by object reference
    }
}

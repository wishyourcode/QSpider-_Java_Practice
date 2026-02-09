package inheritance;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping.");
    }

}

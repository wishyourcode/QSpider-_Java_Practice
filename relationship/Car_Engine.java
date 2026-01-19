package relationship;

public class Car_Engine {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.carModel = "Toyota Camry";
        myCar.carColor = "Red";
        myCar.engine = new Engine();
        myCar.engine.engineModel = "V6";
        myCar.engine.horsePower = 301;
        System.out.println("Car Model: " + myCar.carModel);
        System.out.println("Car Color: " + myCar.carColor);
        System.out.println("Engine Model: " + myCar.engine.engineModel);
        System.out.println("Horse Power: " + myCar.engine.horsePower);

    }
}

class Engine {
    String engineModel;
    int horsePower;
}

class Car {
    String carModel;
    String carColor;
    Engine engine; // Car has an Engine
}

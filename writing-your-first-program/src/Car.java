
/*
    * This is a simple Java program that demonstrates the use of classes and objects.
 */

public class Car {
    // Fields (attributes)
    String color;
    String model;

    // Methods (behavior)
    void start() {
        System.out.println("Car started");
    }
    void stop() {
        System.out.println("Car stopped");
    }
    public static void main(String[] args) {
        Car myCar = new Car(); // Create an object of Car
        myCar.color = "Red";
        myCar.model = "Tesla Model 3";
        System.out.println("Car color: " + myCar.color);
        System.out.println("Car model: " + myCar.model);
        myCar.start();
        myCar.stop();
    }
}
interface Vehicle {
    void start();
    void stop();
}

public class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started");
    }

    public void stop() {
        System.out.println("Bike stopped");
    }

    public static void main(String[] args) {
        Bike myBike = new Bike(); // Creating an object of the Bike class
        myBike.start(); // Calling the start method
        myBike.stop(); // Calling the stop method
    }
}
public class Car {
    String model;
    int year;

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Tesla Model 3";
        myCar.year = 2020;
        System.out.println("Car Model: " + myCar.model);
        System.out.println("Car Year: " + myCar.year);
    }
}
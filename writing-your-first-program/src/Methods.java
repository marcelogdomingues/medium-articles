
/*
    * This program demonstrates the use of methods in Java.
 */

public class Methods {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        Methods calc = new Methods();
        int sum = calc.add(10, 5);
        int diff = calc.subtract(10, 5);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
    }
}

/*
 This program demonstrates how to create and use arrays in Java.
 */

public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Array of integers
        String[] fruits = {"Apple", "Banana", "Cherry"}; // Array of strings
        // Access elements in an array
        System.out.println("First number: " + numbers[0]);
        System.out.println("First fruit: " + fruits[0]);
        // Loop through an array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number: " + numbers[i]);
        }
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
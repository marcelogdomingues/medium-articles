public class ArrayProcessing {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Array of integers
        int sum = 0;

        // For loop to calculate the sum of array elements
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
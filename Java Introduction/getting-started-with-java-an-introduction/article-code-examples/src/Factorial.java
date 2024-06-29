
/*
  Factorial of a number is the product of all positive integers less than or equal to that number.
 */

public class Factorial {

    public static void main(String[] args) {
        int number = 5; // Change this number to calculate the factorial of a different number
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
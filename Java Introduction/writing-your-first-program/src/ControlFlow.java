
/*
    Control Flow in Java
    - If-Else statement
    - For Loop
    - While Loop
    - Do-While Loop
 */

public class ControlFlow {

    public static void main(String[] args) {

        // If-Else statement
        int age = 18;
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not an Adult");
        }

        // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }
        // While Loop
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Do-While Loop
        int num = 0;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num < 5);
    }
}
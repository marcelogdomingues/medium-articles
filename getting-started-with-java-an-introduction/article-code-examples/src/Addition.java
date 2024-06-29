import java.util.Scanner;

/*
 The code snippet above is a simple Java program that reads two numbers from the user and calculates their sum. The program uses the  Scanner  class to read input from the console.
 The program starts by creating a new  Scanner  object to read input from the console. It then prompts the user to enter the first number and reads it using the  nextInt()  method of the  Scanner  class. The same process is repeated for the second number.
 After reading the two numbers, the program calculates their sum and prints it to the console.
 To run this program, you can compile it using the  javac  command and then run it using the  java  command:
 javac Addition.java
 */

public class Addition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}


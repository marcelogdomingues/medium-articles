# Getting Started with Java: An Introduction

## Overview: Brief History of Java

Java is the most widely used programming language in the world today. The people who originally designed it are James Gosling and a team of developers at Sun Microsystems from way back in the middle of the 1990s. Its actual intent originally was to be a language used to drive interactive television; unfortunately, at that time, it was simply too advanced for digital cable television use. Originally, Java was named Oak after an oak tree that stood outside Gosling’s office.

Later, it was renamed Java, inspired by the coffee from Java Island in Indonesia. Finally, Java was released in 1995 and rapidly gained ground in virtue of its WORA nature, which promised the ability to run Java code on any device with a Java Virtual Machine, thereby making it platform-independent. Over the years, Java has continued to be in tandem with time, developing and growing further, with immense contributions from Oracle Corporation, which took over Sun Microsystems in 2010.

## Java Features

Java's popularity and longevity are supported by its robust set of features:

- **Platform Independence**: Programs are compiled to bytecode, runnable on any device with a JVM.
- **Object-Oriented**: Follows principles of encapsulation, inheritance, and polymorphism.
- **Robustness**: Strongly typed with runtime checking and exception handling.
- **Security**: Includes features like the Java sandbox for secure execution.
- **Multithreading**: Capable of running multiple threads simultaneously.
- **High Performance**: Optimized performance through JIT compilation.
- **Distributed Computing**: Supports network-centric programming.

## Setting Up the Environment

### Installing JDK

To develop Java applications, install the Java Development Kit (JDK):

- **Windows**: Download JDK from Oracle, run the installer, and set environment variables.
- **macOS**: Download JDK, move to Applications, and set environment variables.
- **Linux**: Extract JDK, move to /usr/local/, and set environment variables.

### Setting Up an IDE

Use an Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse:

- **IntelliJ IDEA**: Download, install, and configure with JDK 21.
- **Eclipse**: Download, set up a workspace, and create projects with JDK 21.

### Practical Examples

#### Hello World Example

```java
public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
#### Simple Addition Program

```java
import java.util.Scanner;

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
```

#### Using a Method to Calculate Factorial
```java
public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Change this number to calculate factorial of a different number
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
```

## Conclusion
Java is a versatile programming language known for its platform independence, robustness, security features, and suitability for various applications. Setting up a Java development environment involves installing JDK 21 and using IDEs like IntelliJ IDEA or Eclipse. Practical examples such as Hello World, addition programs, and factorial calculations help solidify Java programming concepts.
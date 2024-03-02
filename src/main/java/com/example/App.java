package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public App() {
    }

    public static void main(String[] args) {
        App app = new App();

        try (Scanner scanner = new Scanner(System.in)) {
            double num1, num2;

            do {
                // Display menu options
                System.out.println("Calculator using DevOps CICD.. \n Choose:");
                System.out.print("1. Factorial\n2. Square root\n3. Power\n4. Natural Logarithm\n" +
                        "5. Exit\nEnter your choice: ");

                int choice;
                try {
                    // Get user input for operation choice
                    choice = scanner.nextInt();
                } catch (InputMismatchException error) {
                    // Handle invalid input (non-integer)
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next(); // Consume the invalid input
                    continue;
                }

                switch (choice) {
                    case 1:
                        // Factorial
                        System.out.print("Enter a number : ");
                        num1 = scanner.nextDouble();
                        // Display factorial result
                        System.out.println("Factorial of " + num1 + " is : " + app.factorial(num1));
                        System.out.println("\n");
                        break;

                    case 2:
                        // Square root
                        System.out.print("Enter a number : ");
                        num1 = scanner.nextDouble();
                        // Display square root result
                        System.out.println("Square root of " + num1 + " is : " + app.squareRoot(num1));
                        System.out.println("\n");
                        break;

                    case 3:
                        // Power
                        System.out.print("Enter the first number : ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        num2 = scanner.nextDouble();
                        // Display power result
                        System.out.println(num1 + " raised to power " + num2 + " is : " + app.power(num1, num2));
                        System.out.println("\n");
                        break;

                    case 4:
                        // Natural log
                        System.out.print("Enter a number : ");
                        num1 = scanner.nextDouble();
                        // Display natural log result
                        System.out.println("Natural log of " + num1 + " is : " + app.naturalLog(num1));
                        System.out.println("\n");
                        break;

                    default:
                        // Exit the calculator
                        System.out.println("Exit");
                        return;
                }
            } while (true);
        }
    }

    // Factorial calculation method
    public double factorial(double number1) {
        if (number1 < 0) {
            return Double.NaN;
        }
        double result = fact(number1);
        return result;
    }

    // Recursive factorial calculation method
    public double fact(double num) {
        double facto = 1;
        for (int i = 1; i <= num; ++i) {
            facto *= i;
        }
        return facto;
    }

    // Square root calculation method
    public double squareRoot(double number1) {
        double result = 0;
        try {
            // Check for negative input (imaginary number)
            if (number1 < 0) {
                throw new IllegalArgumentException("Case of Imaginary Number");
            }
            // Calculate square root
            result = Math.sqrt(number1);
        } catch (IllegalArgumentException error) {
            // Handle exception for negative square root
            return Double.NaN;
        }
        return result;
    }

    // Power calculation method
    public double power(double number1, double number2) {
        double result = Math.pow(number1, number2);
        return result;
    }

    // Natural logarithm calculation method
    public double naturalLog(double number1) {
        double result = 0;
        // Check for special cases
        if (number1 == 0) {
            return Double.NaN;
        } else if (number1 < 0) {
            return Double.NaN;
        } else {
            // Calculate natural log
            result = Math.log(number1);
        }

        return result;
    }
}

package org.example;

import java.util.Scanner;

public class Calculator {

    public void startCalculator(Scanner scanner) {
        boolean keepCalculating = true;
        while (keepCalculating) {
            System.out.println("\nCALCULATOR ACTIVATED!");
            System.out.println("Addition and Subtraction allow multiple numbers.");
            System.out.println("Multiplication, Division and Modulus only work with two numbers.\n");

            // Ask for the operator.
            System.out.print("Enter an operator (+, -, *, /, %): ");
            String operator = scanner.nextLine().trim();

            // Validate operator
            if (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%"))) {
                System.out.println("That is not a valid operator! You can only use: +, -, *, /, %.");
                continue;  // Restart the loop if operator is invalid.
            }

            double result;

            // Allows multiple numbers if operator is + or -
            if (operator.equals("+") || operator.equals("-")) {
                System.out.print("Please enter your numbers separated by spaces (10 5 3): ");

                // Split on whitespace.
                String[] inputNumbers = scanner.nextLine().trim().split("\\s+");

                if (inputNumbers.length == 0) {
                    System.out.println("You must enter at least one number!");
                    continue;
                }

                double[] numbers = new double[inputNumbers.length];

                try {
                    for (int i = 0; i < inputNumbers.length; i++) {
                        numbers[i] = Double.parseDouble(inputNumbers[i]);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("That doesn't look like a valid number. Let's try again!");
                    continue;
                }

                try {
                    if (operator.equals("+")) {
                        result = Arithmetics.addition(numbers);
                    } else {
                        result = Arithmetics.subtraction(numbers);
                    }
                    System.out.println("The result is " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            } else {
                // Ask for two numbers for: *, /, %,
                double num1, num2;
                try {
                    System.out.print("Enter the first number: ");
                    num1 = Double.parseDouble(scanner.nextLine().trim());

                    System.out.print("Enter the second number: ");
                    num2 = Double.parseDouble(scanner.nextLine().trim());
                } catch (NumberFormatException e) {
                    System.out.println("That doesn't look like a valid number. Lets try again!");
                    continue; // Restart the loop if input is invalid.
                }

                switch (operator) {
                    case "*":
                        result = Arithmetics.multiplication(num1, num2);
                        break;
                    case "/":
                        try {
                            result = Arithmetics.division(num1, num2);
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                            continue;
                        }
                        break;
                    case "%":
                        try {
                            result = Arithmetics.modulus(num1, num2);
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        // Restart if the operator is not valid.
                        continue;
                }

                System.out.println("The result is " + result);

            }

            System.out.print("\nShould I continue to be your Calculator? Type y/n: ");
            String shutDown = scanner.nextLine().trim().toLowerCase();
            if (!shutDown.equals("y")) {
                keepCalculating = false;
                System.out.println("SHUTTING DOWN CALCULATOR MODE.");
            }
        }
    }
}

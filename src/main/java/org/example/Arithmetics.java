package org.example;

public class Arithmetics {

    public static double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Dividing by zero is not possible! Try again.");
        }
        return a / b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Modulus by zero is not possible! Try again");
        }
        return a % b;
    }

    public static double addition(double[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required for addition! Try again.");
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static double subtraction(double[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("At least two numbers are required for subtraction! Try again.");
        }
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }
}
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticsTest {
    @Test
    void testAddition() {
        // Arrange: Define inputs for addition.
        double a = 2;
        double b = 3;

        // Act: Call the addition method.
        double result = Arithmetics.addition(new double[]{a, b});

        // Assert: Verify the result is as expected.
        assertEquals(5.0, result, 0.001);
    }

    @Test
    void testMultiplication() {
        // Arrange: Define inputs for multiplication.
        double a = 6;
        double b = 3;

        // Act: Call the multiplication method.
        double result = Arithmetics.multiplication(a, b);

        // Assert: Check that the product is correct.
        assertEquals(18.0, result, 0.001);
    }

    @Test
    void testSubtraction() {
        // Arrange: Define inputs for subtraction.
        double a = 10;
        double b = 9;

        // Act: Call the subtraction method.
        double result = Arithmetics.subtraction(new double[]{a, b});

        // Assert: Verify the result matches expected value.
        assertEquals(1.0, result, 0.001);
    }

    @Test
    void testDivision() {
        // Arrange: Define inputs for division.
        double a = 10;
        double b = 2;

        // Act: Call the division method.
        double result = Arithmetics.division(a, b);

        // Assert: Check the division result.
        assertEquals(5.0, result, 0.001);
    }

    @Test
    void testDivisionWithDecimalResult() {
        // Arrange: Define inputs for division.
        double a = 7;
        double b = 2;

        // Act: Call the division method.
        double result = Arithmetics.division(a, b);

        // Assert: Check the division result.
        assertEquals(3.5, result, 0.001);
    }

    @Test
    void testDivisionByZero() {
        // Arrange: Define inputs where divisor is zero.
        double a = 5;
        double b = 0;

        // Act: Verify that division by zero throws the expected exception.
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> Arithmetics.division(a, b)
        );

        // Assert: Check the exception message.
        assertEquals("Dividing by zero is not possible! Try again.", exception.getMessage());
    }

    @Test
    void testSubtractionWithZero() {
        // Arrange: Define inputs where one operand is zero.
        double a = 10;
        double b = 0;

        // Act: Call the subtraction method.
        double result = Arithmetics.subtraction(new double[]{a, b});

        // Assert: Check that the result is correct.
        assertEquals(10, result, 0.001);
    }

    @Test
    void testAdditionWithZero() {
        // Arrange: Define inputs where one operand is zero.
        double a = 10;
        double b = 0;

        // Act: Call the addition method.
        double result = Arithmetics.addition(new double[]{a, b});

        // Assert: Check that the result is correct.
        assertEquals(10, result, 0.001);
    }

    @Test
    void testMultiplicationWithZero() {
        // Arrange: Define inputs where one operand is zero.
        double a = 10;
        double b = 0;

        // Act: Call the multiplication method.
        double result = Arithmetics.multiplication(a, b);

        // Assert: Ensure the result is zero.
        assertEquals(0.0, result, 0.001);
    }

    @Test
    void testAdditionWithNegativeNumbers() {
        // Arrange: Define negative and positive inputs.
        double a = -10;
        double b = 5;

        // Act: Call the addition method.
        double result = Arithmetics.addition(new double[]{a, b});

        // Assert: Check that the result is correct.
        assertEquals(-5.0, result, 0.001);
    }

    @Test
    void testSubtractionWithDecimals() {
        // Arrange: Define decimal inputs.
        double a = 10.5;
        double b = 3.2;

        // Act: Call the subtraction method.
        double result = Arithmetics.subtraction(new double[]{a, b});

        // Assert: Verify the result with a small tolerance.
        assertEquals(7.3, result, 0.001);
    }

    @Test
    void testModulus() {
        // Arrange: Define inputs for modulus operation.
        double a = 10;
        double b = 3;

        // Act: Call the modulus method.
        double result = Arithmetics.modulus(a, b);

        // Assert: Verify the remainder is correct.
        assertEquals(1.0, result, 0.001);
    }

    @Test
    void testModulusWithZeroRemainder() {
        // Arrange: Define inputs where modulus should return zero.
        double a = 10;
        double b = 2;

        // Act: Call the modulus method.
        double result = Arithmetics.modulus(a, b);

        // Assert: The result should be 0.
        assertEquals(0.0, result, 0.001);
    }

    @Test
    void testModulusByZero() {
        // Arrange: Define inputs where the divisor is zero.
        double a = 10;
        double b = 0;

        // Act: Verify that modulus by zero throws the expected exception.
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> Arithmetics.modulus(a, b)
        );

        // Assert: Check the exception message.
        assertEquals("Modulus by zero is not possible! Try again", exception.getMessage());
    }

    @Test
    void testAdditionWithMultipleOperands() {
        // Arrange: Define inputs for addition with multiple numbers.
        double[] numbers = {1, 2, 3, 4};

        // Act: Call the addition method.
        double result = Arithmetics.addition(numbers);

        // Assert: Verify the result is as expected.
        assertEquals(10.0, result, 0.001);
    }

    @Test
    void testSubtractionWithMultipleOperands() {
        // Arrange: Define inputs for subtraction with multiple numbers.
        double[] numbers = {20, 5, 3};

        // Act: Call the subtraction method.
        double result = Arithmetics.subtraction(numbers);

        // Assert: Verify the result matches expected value.
        // Expected: 20 - 5 - 3 = 12.
        assertEquals(12.0, result, 0.001);
    }

    @Test
    void testAdditionWithEmptyArray() {
        // Arrange: Define an empty array for addition.
        double[] numbers = {};

        // Act: Verify that calling addition with an empty array throws an exception.
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> Arithmetics.addition(numbers));

        // Assert: Check the exception message.
        assertEquals("At least one number is required for addition! Try again.", exception.getMessage());
    }

    @Test
    void testSubtractionWithSingleOperand() {
        // Arrange: Define an array with a single number for subtraction.
        double[] numbers = {10};

        // Act: Verify that calling subtraction with a single operand throws an exception.
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> Arithmetics.subtraction(numbers));

        // Assert: Check the exception message.
        assertEquals("At least two numbers are required for subtraction! Try again.", exception.getMessage());
    }

}
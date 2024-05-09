package com.example.calculator;

public class CalculatorApplication {

    // Method to add two real numbers
    public float sum(float number1, float number2) {
        return number1 + number2;
    }

    // Method to subtract the second real number from the first
    public float subtract(float number1, float number2) {
        return number1 - number2;
    }

    // Method to multiply two real numbers
    public float multiply(float number1, float number2) {
        return number1 * number2;
    }

    // Method to divide the first real number by the second
    public float divide(float number1, float number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return number1 / number2;
    }
}

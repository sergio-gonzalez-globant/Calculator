package com.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorApplicationTests {

    private CalculatorApplication calculator;

    @BeforeEach
    public void setUp() {
        calculator = new CalculatorApplication();
    }

    @Test
    public void testSum() {
        float result = calculator.sum(10, 15);
        Assertions.assertEquals(25, result, "10 + 15 should equal 25");
    }

    @Test
    public void testSubtract() {
        float result = calculator.subtract(20, 5);
        Assertions.assertEquals(15, result, "20 - 5 should equal 15");
    }

    @Test
    public void testMultiply() {
        float result = calculator.multiply(4, 6);
        Assertions.assertEquals(24, result, "4 * 6 should equal 24");
    }

    @Test
    public void testDivide() {
        float result = calculator.divide(20, 4);
        Assertions.assertEquals(5, result, "20 / 4 should equal 5");
    }

    @Test
    public void testDivideByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        }, "Dividing by zero should throw ArithmeticException");
    }
}
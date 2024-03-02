package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final double DELTA = 1e-15;
    App calculator = new App();

    @Test
    public void testFactorialWithPositiveNumbers() {
        assertEquals("Factorial of 6", 720, calculator.factorial(6), DELTA);
        assertEquals("Factorial of 0", 1, calculator.factorial(0), DELTA);
    }

    @Test
    public void testFactorialWithNegativeNumbers() {

        assertTrue("Factorial of -5 should be NaN", Double.isNaN(calculator.factorial(-5)));
        assertTrue("Factorial of -6 should be NaN", Double.isNaN(calculator.factorial(-6)));
    }

    @Test
    public void testPowerWithPositiveNumbers() {
        assertEquals("Power of 3^4", 81, calculator.power(3, 4), DELTA);
        assertEquals("Power of 5^2", 25, calculator.power(5, 2), DELTA);
    }

    public void testPowerWithNegativeExponents() {
        assertEquals("Power of 2^(-3) should be 1/8", 1.0 / 8.0, calculator.power(2, -3), DELTA);
        assertEquals("Power of 3^(-2) should be 1/9", 1.0 / 9.0, calculator.power(3, -2), DELTA);
    }

    @Test
    public void testNaturalLogWithPositiveNumbers() {
        assertEquals("Natural log of 1", 0, calculator.naturalLog(1), DELTA);
        assertEquals("Natural log of e", 1, calculator.naturalLog(2.718281828459045), DELTA);
    }

    @Test
    public void testNaturalLogWithNegativeNumbers() {
        assertTrue("Natural log of -2.4 should be NaN", Double.isNaN(calculator.naturalLog(-2.4)));
        assertTrue("Natural log of -2.1 should be NaN", Double.isNaN(calculator.naturalLog(-2.1)));
    }

    @Test
    public void testSquareRootWithPositiveNumbers() {
        assertEquals("Square root of 16", 4, calculator.squareRoot(16), DELTA);
        assertEquals("Square root of 36", 6, calculator.squareRoot(36), DELTA);
    }

    @Test
    public void testSquareRootWithNegativeNumbers() {
        assertTrue("Square root of -3 should not be a real number", Double.isNaN(calculator.squareRoot(-3)));
        assertTrue("Square root of -81 should not be a real number", Double.isNaN(calculator.squareRoot(-81)));
    }

}

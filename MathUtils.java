/**
 * Unit Tests for Math Utilities Library
 * =====================================
 *
 * This file contains unit tests for all functions in the MathUtils class.
 * Contributors should add tests for their functions following the established pattern.
 *
 * To run tests:
 * javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" *.java
 * java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MathUtilsTest
 *
 * Or use your preferred IDE's test runner.
 */

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

/**
 * Test cases for the MathUtils class.
 */
public class MathUtilsTest {

    /**
     * Set up method called before each test.
     */
    @Before
    public void setUp() {
        // Initialize any test data here if needed
    }

    /**
     * Clean up method called after each test.
     */
    @After
    public void tearDown() {
        // Clean up resources here if needed
    }

    /**
     * Set up method called once before all tests.
     */
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Starting MathUtils tests...");
    }

    /**
     * Clean up method called once after all tests.
     */
    @AfterClass
    public static void tearDownClass() {
        System.out.println("All MathUtils tests completed.");
    }

    // ===== FIBONACCI FUNCTION TESTS =====

    /**
     * Test Fibonacci function with base cases.
     * Author: Admin (Starter Test)
     */
@Test
    public void testFibonacciBaseCases() {
        assertEquals("Fibonacci(0) should be 0", 0, MathUtils.fibonacci(0));
        assertEquals("Fibonacci(1) should be 1", 1, MathUtils.fibonacci(1));
    }

    /**
     * Test Fibonacci function with small positive numbers.
     * Author: Admin (Starter Test)
     */
    @Test
    public void testFibonacciSmallNumbers() {
        long[] expectedValues = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        for (int i = 0; i < expectedValues.length; i++) {
            assertEquals("Fibonacci(" + i + ") failed",
                    expectedValues[i], MathUtils.fibonacci(i));
        }
    }

    /**
     * Test Fibonacci function with larger numbers.
     * Author: Admin (Starter Test)
     */
  *
     * @param a First integer
     * @param b Second integer
     * @return GCD of a and b
     * @author [Your Name Here]
     */
    // public static int gcd(int a, int b) {
    //     // TODO: Implement
    //     throw new UnsupportedOperationException("Not implemented yet");
    // }

    /**
     * Check if a number is prime.
     * TODO: Implement primality test
     *
     * @param n Number to check
     * @return true if n is prime, false otherwise
     * @author [Your Name Here]
     */
    // public static boolean isPrime(int n) {
    //     // TODO: Implement
    //     throw new UnsupportedOperationException("Not implemented yet");
    // }

    /**
     * Calculate factorial of a non-negative integer.
     * TODO: Implement factorial calculation
     *
     * @param n Non-negative integer
     * @return n! (n factorial)
     * @throws IllegalArgumentException if n is negative
     * @author [Your Name Here]
     */
    // public static BigInteger factorial(int n) {
    //     // TODO: Implement

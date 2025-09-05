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
    @Test
    public void testFibonacciLargerNumbers() {
        assertEquals("Fibonacci(15) should be 610", 610, MathUtils.fibonacci(15));
        assertEquals("Fibonacci(20) should be 6765", 6765, MathUtils.fibonacci(20));
        assertEquals("Fibonacci(25) should be 75025", 75025, MathUtils.fibonacci(25));
    }

    /**
     * Test that Fibonacci throws IllegalArgumentException for negative input.
     * Author: Admin (Starter Test)
     */
    @Test(expected = IllegalArgumentException.class)
    public void testFibonacciNegativeInput() {
        MathUtils.fibonacci(-1);
    }

    /**
     * Test that Fibonacci throws IllegalArgumentException for multiple negative inputs.
     * Author: Admin (Starter Test)
     */
    @Test
    public void testFibonacciMultipleNegativeInputs() {
        int[] negativeInputs = {-1, -5, -10, -100};

        for (int input : negativeInputs) {
            try {
                MathUtils.fibonacci(input);
                fail("Expected IllegalArgumentException for input: " + input);
            } catch (IllegalArgumentException e) {
                // Expected behavior
                assertTrue("Exception message should mention negative numbers",
                        e.getMessage().contains("negative"));
            }
        }
    }

    // TODO: Add tests for your functions here following this template:
    /*
     * @Test
     * public void testYourFunctionNameBasicCase() {
     *     // Test your function with basic inputs
     *     // Author: Your Name
     *     ReturnType result = MathUtils.yourFunctionName(testInput);
     *     ReturnType expected = expectedOutput;
     *     assertEquals("Description of what should happen", expected, result);
     * }
     *
     * @Test
     * public void testYourFunctionNameEdgeCases() {
     *     // Test your function with edge cases
     *     // Author: Your Name
     *     // Test with edge cases like zero, negative numbers, empty input, etc.
     * }
     *
     * @Test(expected = ExceptionType.class)
     * public void testYourFunctionNameException() {
     *     // Test that your function throws appropriate exceptions
     *     // Author: Your Name
     *     MathUtils.yourFunctionName(invalidInput);
     * }
     */

    // PLACEHOLDER TEST METHODS - Uncomment and implement when functions are added:

    /*
    @Test
    public void testGcdBasicCases() {
        // Test GCD function with basic cases
        // TODO: Implement when gcd function is added
        // Author: [Your Name Here]
    }

    @Test
    public void testIsPrimeSmallPrimes() {
        // Test prime checking with small prime numbers
        // TODO: Implement when isPrime function is added
        // Author: [Your Name Here]
    }

    @Test
    public void testFactorialSmallNumbers() {
        // Test factorial with small numbers
        // TODO: Implement when factorial function is added
        // Author: [Your Name Here]
    }

    @Test
    public void testPowerModBasicCases() {
        // Test modular exponentiation with basic cases
        // TODO: Implement when powerMod function is added
        // Author: [Your Name Here]
    }

    @Test
    public void testDigitSumPositiveNumbers() {
        // Test digit sum with positive numbers
        // TODO: Implement when digitSum function is added
        // Author: [Your Name Here]
    }
    */

    // ===== UTILITY TEST METHODS =====

    /**
     * Helper method to test arrays for equality with descriptive messages.
     *
     * @param message Description of what is being tested
     * @param expected Expected array values
     * @param actual Actual array values
     */
    private void assertArrayEquals(String message, long[] expected, long[] actual) {
        assertEquals(message + " - arrays should have same length",
                expected.length, actual.length);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(message + " - element at index " + i,
                    expected[i], actual[i]);
        }
    }

    /**
     * Helper method to measure execution time of operations.
     * Useful for performance testing of mathematical functions.
     *
     * @param operation Runnable operation to time
     * @return Execution time in milliseconds
     */
    private long measureExecutionTime(Runnable operation) {
        long startTime = System.currentTimeMillis();
        operation.run();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    /**
     * Example performance test for Fibonacci function.
     * Author: Admin (Example)
     */
    
}

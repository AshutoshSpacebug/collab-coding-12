/**
 * Unit Tests for Fibonacci Function
 * =================================
 * 
 * Focused test class for the Fibonacci function in MathUtils.
 * 
 * To run this specific test class:
 * javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" *.java
 * java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore FibonacciTest
 */

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

/**
 * Test cases specifically for the Fibonacci function.
 */
public class FibonacciTest {

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Starting Fibonacci function tests...");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Fibonacci tests completed.");
    }

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

    /**
     * Test Fibonacci function performance with reasonable inputs.
     * Author: Admin (Performance Test)
     */
    @Test
    public void testFibonacciPerformance() {
        long startTime = System.currentTimeMillis();
        
        // Calculate Fibonacci numbers 0 through 30
        for (int i = 0; i <= 30; i++) {
            MathUtils.fibonacci(i);
        }
        
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        
        // Should complete in reasonable time (less than 1 second)
        assertTrue("Fibonacci calculations should complete quickly (was " + executionTime + "ms)", 
                  executionTime < 1000);
    }

    /**
     * Test Fibonacci sequence properties.
     * Author: Admin (Mathematical Properties Test)
     */
    @Test
    public void testFibonacciSequenceProperties() {
        // Test that F(n) = F(n-1) + F(n-2) for n >= 2
        for (int n = 2; n <= 15; n++) {
            long fibN = MathUtils.fibonacci(n);
            long fibN1 = MathUtils.fibonacci(n - 1);
            long fibN2 = MathUtils.fibonacci(n - 2);
            
            assertEquals("Fibonacci property F(" + n + ") = F(" + (n-1) + ") + F(" + (n-2) + ")",
                        fibN1 + fibN2, fibN);
        }
    }
}

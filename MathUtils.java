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

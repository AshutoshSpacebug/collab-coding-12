/**
 * Math Utilities Library - Collaborative Project
 * ==============================================
 *
 * A collection of useful mathematical utility functions contributed by various developers.
 * Each function should be well-documented, tested, and include author attribution.
 *
 * Theme: Mathematical Utilities
 * Authors: [Contributors will add their names here]
 *
 * @version 1.0
 */

/**
 * A collection of mathematical utility functions.
 *
 * This class serves as a container for various mathematical operations
 * that are commonly needed but not available in the standard library.
 */
public class MathUtils {

    /**
     * Calculate the nth Fibonacci number using dynamic programming.
     *
     * The Fibonacci sequence starts with 0, 1, and each subsequent number
     * is the sum of the two preceding ones: 0, 1, 1, 2, 3, 5, 8, 13, ...
     *
     * @param n The position in the Fibonacci sequence (0-indexed)
     * @return The nth Fibonacci number
     * @throws IllegalArgumentException if n is negative
     *
     * @example
     * MathUtils.fibonacci(0)  // returns 0
     * MathUtils.fibonacci(5)  // returns 5
     * MathUtils.fibonacci(10) // returns 55
     *
     * @author Admin (Starter Function)
     */
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci sequence is not defined for negative numbers");
        }

        if (n <= 1) {
            return n;
        }

        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

    // TODO: Add your function here following the template below
    /*
     * TEMPLATE FOR NEW FUNCTIONS:
     *
     * /**
     *  * Brief description of what the function does.
     *  *
     *  * Detailed description explaining the algorithm, use cases, or mathematical
     *  * background if relevant.
     *  *
     *  * @param param1 Description of first parameter
     *  * @param param2 Description of second parameter
     *  * @return Description of return value
     *  * @throws ExceptionType When this exception is thrown
     *  *
     *  * @example
     *  * MathUtils.yourFunctionName(arg1, arg2)  // returns expected_output
     *  *
     *  * @author Your Name
     *  *\/
     * public static ReturnType yourFunctionName(ParamType1 param1, ParamType2 param2) {
     *     // Your implementation here
     *     return result;
     * }
     */

    // PLACEHOLDER FUNCTIONS - Contributors can implement these or add their own:

    /**
     * Calculate the Greatest Common Divisor of two integers.
     * TODO: Implement Euclidean algorithm
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
    //     throw new UnsupportedOperationException("Not implemented yet");
    // }

    /**
     * Calculate (base^exponent) % modulus efficiently.
     * TODO: Implement modular exponentiation
     *
     * @param base Base number
     * @param exponent Exponent
     * @param modulus Modulus
     * @return (base^exponent) % modulus
     * @author [Your Name Here]
     */
    // public static long powerMod(long base, long exponent, long modulus) {
    //     // TODO: Implement
    //     throw new UnsupportedOperationException("Not implemented yet");
    // }

    /**
     * Calculate the sum of digits in a number.
     * TODO: Implement digit sum calculation
     *
     * @param n Number to process
     * @return Sum of all digits in n
     * @author [Your Name Here]
     */
    // public static int digitSum(int n) {
    //     // TODO: Implement
    //     throw new UnsupportedOperationException("Not implemented yet");
    // }

    /**
     * Main method for quick testing of implemented functions.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Math Utils Library - Quick Test");
        System.out.println("================================");

        try {
                        System.out.println("\nReady for contributions! ");

        } catch (Exception e) {
            System.err.println("Error during testing: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

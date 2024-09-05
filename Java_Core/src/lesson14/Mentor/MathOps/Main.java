package lesson14.Mentor.MathOps;

public class Main {
    public static void main(String[] args) {
        // Test MathOperations
        MathOperations math = new MathOperations();
        int result1 = math.multiply(5, 3);
        double result2 = math.multiply(2.5, 4.0);
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);

        // Test AdvancedMathOperations
        AdvancedMathOperations advancedMath = new AdvancedMathOperations();
        int result3 = advancedMath.multiply(4, 3, true); // Exponentiation: 2^3 = 8
        int result4 = advancedMath.multiply(4, 2); // Regular multiplication: 4 * 2 = 8
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);
    }
}

package lesson14.Main.MathOps;

public class Main {
    public static void main(String[] args) {
        MathOps mathOps = new MathOps();

        // Test addition
        int sum = mathOps.add(10, 5);
        System.out.println("Sum: " + sum);

        // Test subtraction
        double result = mathOps.subtract(15.5, 3.2);
        System.out.println("Subtraction Result: " + result);

        // Test multiplication
        float product = mathOps.multiply(2.5f, 4.0f);
        System.out.println("Multiplication Result: " + product);

        // Test division
        long quotient = mathOps.divide(20L, 5L);
        System.out.println("Division Result: " + quotient);
    }
}

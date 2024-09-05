package lesson14.Mentor.MathOps;

public class AdvancedMathOperations extends MathOperations{
    @Override
    public int multiply(int num1, int num2) {
        return super.multiply(num1, num2);
    }

    @Override
    public double multiply(double num1, double num2) {
        return super.multiply(num1, num2);
    }

    public int multiply(int num1, int num2, boolean exponentiation) {
        if (exponentiation) {
            return (int) Math.pow(num1, num2);
        } else {
            return super.multiply(num1, num2);
        }
    }
}

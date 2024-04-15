package lesson14.Main.MathOps;

public class MathOps {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two doubles
    public double subtract(double x, double y) {
        return x - y;
    }

    // Method to multiply two floats
    public float multiply(float p, float q) {
        return p * q;
    }

    // Method to divide two longs
    public long divide(long m, long n) {
        if (n != 0) {
            return m / n;
        } else {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
    }
}


package lesson14.Main.Shape;

public class ShapeCalculator {
    public double calculateArea(int length, int width) {
        return length * width;
    }

    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

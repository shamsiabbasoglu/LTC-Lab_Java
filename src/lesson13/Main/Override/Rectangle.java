package lesson13.Main.Override;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double baseArea = super.calculateArea();
        double rectangleArea = length * width;
        return baseArea + rectangleArea;
    }
}

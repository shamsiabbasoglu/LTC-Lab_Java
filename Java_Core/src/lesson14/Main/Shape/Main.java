package lesson14.Main.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        double rectangleArea = calculator.calculateArea(5,8);

        double circleArea = calculator.calculateArea(3);

        double triangleArea = calculator.calculateArea(3.3,5.5);

        System.out.println("Area of rectangle: " + rectangleArea + "\n" +
                "Area of circle: " + circleArea + "\n" +
                "Area of triangle: " + triangleArea);
    }
}

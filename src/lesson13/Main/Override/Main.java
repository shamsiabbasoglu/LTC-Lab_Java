package lesson13.Main.Override;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        System.out.println("Area of circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}

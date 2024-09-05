package lesson11.Main;

import java.util.Scanner;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Circle area with radius " + radius + " units: " + circle.calculateArea());
    }
}

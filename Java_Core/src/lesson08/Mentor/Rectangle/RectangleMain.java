package lesson08.Mentor.Rectangle;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.println("What color is rectangle? ");
        shape.color = scanner.nextLine();
        System.out.println("Type width value: ");
        shape.width = scanner.nextDouble();
        System.out.println("Type length value: ");
        shape.length = scanner.nextDouble();

        shape.printShape();
    }
}

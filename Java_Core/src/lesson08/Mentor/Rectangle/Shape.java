package lesson08.Mentor.Rectangle;

public class Shape {
    String color;
    double width;
    double length;

    public double calculateArea(double width, double length) {
        return width * length;
    }

    public void printShape() {
        if (width == length) {
            System.out.println("Given " + color.toLowerCase() + " coloured rectangle is square. " +
                    "Its area is " + calculateArea(width, length) + " sq.metres.");
        } else {
            System.out.println("Given " + color.toLowerCase() + " coloured rectangle's area " +
                    "is " + calculateArea(width, length) + " sq.metres");
        }
    }
}

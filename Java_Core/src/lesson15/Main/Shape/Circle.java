package lesson15.Main.Shape;

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void displayInfo() {
        System.out.println("This circle area is " + calculateArea() + ".");
    }
}

package lesson15.Main.Shape;

class Square extends Shape {
    double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    public void displayInfo() {
        System.out.println("This square area is " + calculateArea() + ".");
    }
}

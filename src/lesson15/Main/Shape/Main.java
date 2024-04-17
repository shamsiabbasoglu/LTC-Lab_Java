package lesson15.Main.Shape;

class Main {
     public static void main(String[] args) {
        Circle circle = new Circle(3.4);
        circle.calculateArea();
        circle.displayInfo();

        Square square = new Square(4.5);
        square.calculateArea();
        square.displayInfo();
    }
}

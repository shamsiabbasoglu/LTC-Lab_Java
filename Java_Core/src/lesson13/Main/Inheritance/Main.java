package lesson13.Main.Inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mini", "Cooper", 4);
        System.out.println("Car details:");
        car.display();

        Bike bike = new Bike("Kawasaki", "Ninja 300", 2);
        System.out.println("Bike details:");
        bike.display();
    }
}
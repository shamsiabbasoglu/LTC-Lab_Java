package lesson11.Main;

public class Car {
    String make;
    String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");

        System.out.println("My car is: " + car.make + " " + car.model);
    }
}

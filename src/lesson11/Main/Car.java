package lesson11.Main;

public class Car {
    String make;
    String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return "My car is: " + make + " " + model;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");

        System.out.println(car);
    }
}

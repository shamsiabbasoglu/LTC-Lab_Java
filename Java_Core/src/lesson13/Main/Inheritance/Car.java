package lesson13.Main.Inheritance;

public class Car extends Vehicle {
    int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Number of doors: " + numDoors);
    }
}
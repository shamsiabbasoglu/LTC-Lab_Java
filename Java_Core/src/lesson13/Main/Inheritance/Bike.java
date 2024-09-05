package lesson13.Main.Inheritance;

public class Bike extends Vehicle {
    int numWheels;

    public Bike(String make, String model, int numWheels) {
        super(make, model);
        this.numWheels = numWheels;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Number of wheels: " + numWheels);
    }
}
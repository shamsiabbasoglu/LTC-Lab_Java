package lesson15.Mentor.BirdPlane;

public class Plane implements Transport, Flyable {
    private final int capacity;
    private String destination;

    Plane(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public void takeOff() {
        System.out.println("Plane takes off...");
    }

    @Override
    public void land() {
        System.out.println("Plane lands at " + destination);
    }
}

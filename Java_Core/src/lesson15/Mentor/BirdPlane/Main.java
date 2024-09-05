package lesson15.Mentor.BirdPlane;

public class Main {
    public static void main(String[] args) {
        Bird woodpecker = new Bird("Woodpecker");
        System.out.println("Bird name is " + woodpecker.getName());
        woodpecker.makeSound();
        woodpecker.takeOff();
        woodpecker.land();

        Plane airbus = new Plane(525);
        airbus.setDestination("Istanbul");
        System.out.println("Plane capacity: " + airbus.getCapacity());
        System.out.println("Plane destination: " + airbus.getDestination());
        airbus.takeOff();
        airbus.land();
    }
}

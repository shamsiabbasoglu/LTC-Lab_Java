package lesson15.Mentor.BirdPlane;

public class Bird implements Animal, Flyable {
    private final String name;

    Bird(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes sound: \"\033[3mChurr churr!\033[0m\"");
    }

    @Override
    public void takeOff() {
        System.out.println(name + " takes off from the branch.");
    }

    @Override
    public void land() {
        System.out.println(name + " lands on the branch.");
    }
}

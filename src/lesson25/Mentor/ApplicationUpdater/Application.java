package lesson25.Mentor.ApplicationUpdater;

public class Application {
    private final String name;
    private double version;

    public Application(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public double getVersion() {
        return version;
    }
}

package lesson13.Mentor.Product;

public class CPU extends Product {
    private final int cores;
    private final double clockSpeed;

    public CPU(String brand, String model, int cores, double clockSpeed) {
        super(brand, model);
        this.cores = cores;
        this.clockSpeed = clockSpeed;
    }

    public String process() {
        return " processing with " + cores + " cores at " + clockSpeed + " GHz";
    }
}

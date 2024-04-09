package lesson13.Mentor.Product;

public class GPU extends Product {
    private final int vRam;

    public GPU(String brand, String model, int vRam) {
        super(brand, model);
        this.vRam = vRam;
    }

    public String render() {
        return " rendering with " + vRam + " GB vRAM";
    }
}

package lesson13.Mentor.Product;

public class Laptop extends Product {
    private final CPU cpu;
    private final GPU gpu;

    public Laptop(String brand, String model, CPU cpu, GPU gpu) {
        super(brand, model);
        this.gpu = gpu;
        this.cpu = cpu;
    }

    public String start() {
        return " started with " + cpu.getInfo() + " and " + gpu.getInfo();
    }

}

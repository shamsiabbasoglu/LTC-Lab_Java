package lesson13.Mentor.Product;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel", "i9", 24, 3.2);
        GPU gpu = new GPU("NVIDIA", "RTX 4090", 24);
        Laptop laptop = new Laptop("Razer", "Blade 16", cpu, gpu);

        System.out.println(laptop.getInfo() + laptop.start());
        System.out.println(cpu.getInfo() + cpu.process());
        System.out.println(gpu.getInfo() + gpu.render());
    }
}

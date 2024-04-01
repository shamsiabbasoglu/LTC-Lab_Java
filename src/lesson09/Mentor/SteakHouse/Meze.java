package lesson09.Mentor.SteakHouse;

public class Meze {
    String name;
    double price;

    public Meze(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Meze{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

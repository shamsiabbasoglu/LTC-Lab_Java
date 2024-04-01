package lesson09.Mentor.SteakHouse;

public class Kabab {
    String name;
    double price;

    public Kabab(String name, double price) {
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
        return "Kabab{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

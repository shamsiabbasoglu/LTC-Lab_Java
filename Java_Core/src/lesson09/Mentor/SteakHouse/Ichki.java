package lesson09.Mentor.SteakHouse;

public class Ichki {
    String name;
    double price;

    public Ichki(String name, double price) {
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
        return "Ichki{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

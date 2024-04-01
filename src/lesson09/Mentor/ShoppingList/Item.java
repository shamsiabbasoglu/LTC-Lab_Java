package lesson09.Mentor.ShoppingList;

public class Item {
    String name;
    double price;

    public double getPrice() {
        return price;
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}

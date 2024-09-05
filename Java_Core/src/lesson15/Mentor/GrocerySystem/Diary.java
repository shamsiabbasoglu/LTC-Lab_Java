package lesson15.Mentor.GrocerySystem;

public class Diary implements Product{
    private final String name;
    private final double unitPrice;
    private final double amount;

    public Diary(String name, double unitPrice, double amount) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    @Override
    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public double getCost() {
        return getUnitPrice() * getAmount();
    }

    @Override
    public String toString() {
        return name + ": ₼ " + String.format("%.2f", getCost());
    }
}

package lesson09.Mentor.ShoppingList;

import java.util.Arrays;

public class ShoppingList {
    Item[] items = new Item[0];

    public double calculateTotalCost() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void addItem(Item... newItem) {
        for (Item i : newItem) {
            items = Arrays.copyOf(items, items.length + 1);
            items[items.length - 1] = i;
        }
    }

    @Override
    public String toString() {
        String list = "";
        for (Item i : items){
            list += i + "\n";
        }
        list += "Total is: " + calculateTotalCost();
        return list;
    }
}


package lesson15.Mentor.GrocerySystem;

public class GroceryShopping {
    private final Product[] shoppingList;
    private int itemCount;

    public GroceryShopping(int capacity) {
        shoppingList = new Product[capacity];
        itemCount = 0;
    }

    public void addProduct(Product product) {
        if (itemCount < shoppingList.length) {
            shoppingList[itemCount] = product;
            itemCount++;
        } else {
            System.out.println("Shopping list is full.");
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += shoppingList[i].getCost();
        }
        return totalCost;
    }

    public void printReceipt() {
        System.out.println("Shopping List:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(shoppingList[i].toString());
        }
        System.out.println("Total Cost: ₼ " + String.format("%.2f", calculateTotalCost()));
    }
}

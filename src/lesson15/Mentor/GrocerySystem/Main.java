package lesson15.Mentor.GrocerySystem;

public class Main {
    public static void main(String[] args) {
        GroceryShopping groceryShopping = new GroceryShopping(9999);

        groceryShopping.addProduct(new Diary("Yogurt", 2, 2));
        groceryShopping.addProduct(new FreshProduce("Banana", 2, 2));
        groceryShopping.addProduct(new Meat("Beef", 35, 1.55));
        groceryShopping.addProduct(new Diary("Sugar", 2.5, 1.86));
        groceryShopping.addProduct(new FreshProduce("Watermelon", 1.15, 7.89));

        groceryShopping.printReceipt();
    }
}

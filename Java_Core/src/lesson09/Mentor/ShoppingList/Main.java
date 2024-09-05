package lesson09.Mentor.ShoppingList;

public class Main {
    public static void main(String[] args) {
        Item i1 = new Item("bread", 0.5);
        Item i2 = new Item("sugar", 1.8);
        Item i3 = new Item("salt", 2.2);
        Item i4 = new Item("soap", 1.4);
        Item i5 = new Item("egg", 0.2);

        ShoppingList sl = new ShoppingList();

        sl.addItem(i1, i2, i3, i4, i5);

        System.out.println(sl);
    }
}

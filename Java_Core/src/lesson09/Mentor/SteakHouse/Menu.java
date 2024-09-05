package lesson09.Mentor.SteakHouse;

public class Menu {
    Kabab kabab;
    Meze meze;
    Ichki ichki;

    public Menu(Kabab kabab, Meze meze, Ichki ichki) {
        this.kabab = kabab;
        this.meze = meze;
        this.ichki = ichki;
    }

    public double calculateTotalPrice() {
        return kabab.getPrice() + meze.getPrice() + ichki.getPrice();
    }

    @Override
    public String toString() {
        return "Kabab: " + kabab.getName() + ", Meze: " + meze.getName() + ", Ichki: " + ichki.getName() + ", Total Price: " + calculateTotalPrice();
    }
}

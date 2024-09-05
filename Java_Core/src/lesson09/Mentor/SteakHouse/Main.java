package lesson09.Mentor.SteakHouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter kabab choice: ");
        String kababName = scanner.nextLine();
        System.out.println("Enter kabab price: ");
        double kababPrice = scanner.nextDouble();

        System.out.println("Enter meze choice: ");
        String mezeName = scanner.next();
        System.out.println("Enter meze price: ");
        double mezePrice = scanner.nextDouble();

        System.out.println("Enter ichki choice: ");
        String ichkiName = scanner.next();
        System.out.println("Enter ichki price: ");
        double ichkiPrice = scanner.nextDouble();

        Kabab kabab = new Kabab(kababName, kababPrice);
        Meze meze = new Meze(mezeName, mezePrice);
        Ichki ichki = new Ichki(ichkiName, ichkiPrice);

        Menu menu = new Menu(kabab, meze, ichki);

        System.out.println("Total Price: " + menu.calculateTotalPrice());
    }


}

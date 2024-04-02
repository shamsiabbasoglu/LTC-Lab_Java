package lesson11.Mentor.CasinoApp;

import java.util.Scanner;

public class CasinoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SlotMachine slotMachine = new SlotMachine();

        System.out.println("Welcome to the slot machine game!");

        while (true) {
            System.out.println("Press 'P' to pull the lever or 'Q' to quit: ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.equals("P")) {
                slotMachine.pullLever();
            } else if (input.equals("Q")) {
                System.out.println("Thank you for playing! Goodbye!");
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}

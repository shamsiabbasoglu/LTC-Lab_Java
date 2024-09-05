package lesson11.Mentor.CasinoApp;

import java.util.Random;

public class SlotMachine {
    static String[] symbols = {"🍒", "🍋", "🍊", "🔔", "🍉", "🍇"};

    public void pullLever() {
        Random random = new Random();
        String[] result = new String[3];

        for (int i = 0; i < 3; i++) {
            int randomIndex = random.nextInt(symbols.length);
            result[i] = symbols[randomIndex];
        }

        System.out.println("Slot Machine Result: " + String.join(" ", result));

        if (result[0].equals(result[1]) && result[1].equals(result[2])) {
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("Sorry, better luck next time!");
        }
    }
}

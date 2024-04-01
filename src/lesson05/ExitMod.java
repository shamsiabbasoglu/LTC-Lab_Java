package lesson05;

import java.util.Scanner;

public class ExitMod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int random = (int) (Math.random() * 100 + 1);
        boolean correct = false;

        do {
            System.out.println("Enter your guess (out of 100) or type 'exit' to end the game: ");
            String userInput = scan.next();
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("The game was quited. The secret number was " + random + ".");
                break;
            }

            if (userInput.matches("\\d+")) {
                int userNum = Integer.parseInt(userInput);

                if (userNum > random) {
                    System.out.println("Too high. Try again!");
                } else if (userNum < random) {
                    System.out.println("Too low. Try again!");
                } else {
                    System.out.println("Congratulations! You guessed the correct number.");
                    correct = true;
                }
            } else {
                System.out.println("Invalid input. Please enter a number or type exit.");
            }
        } while (!correct);
    }
}

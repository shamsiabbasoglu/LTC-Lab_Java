package lesson19.Mentor.GuessCharacter;

import java.util.Scanner;

public class GuessType {
    public static CharacterType determineCharacterType() {
        Scanner scanner = new Scanner(System.in);
        int countExtrovert = 0;
        int countIntrovert = 0;
        int countAmbivert = 0;

        System.out.println("Answer the following questions to determine your character type:");
        System.out.println("1. Do you enjoy social gatherings? (yes/no)");
        String response = scanner.nextLine().trim().toLowerCase();
        if (response.equals("yes")) {
            countExtrovert++;
        } else if (response.equals("no")) {
            countIntrovert++;
        } else {
            System.out.println("Invalid response. Please answer with 'yes' or 'no'.");
        }

        System.out.println("2. Do you prefer spending time alone? (yes/no)");
        response = scanner.nextLine().trim().toLowerCase();
        if (response.equals("yes")) {
            countIntrovert++;
        } else if (response.equals("no")) {
            countExtrovert++;
        } else {
            System.out.println("Invalid response. Please answer with 'yes' or 'no'.");
        }

        System.out.println("3. Are you comfortable in both social and solitary situations? (yes/no)");
        response = scanner.nextLine().trim().toLowerCase();
        if (response.equals("yes")) {
            countAmbivert++;
        } else if (!response.equals("no")) {
            System.out.println("Invalid response. Please answer with 'yes' or 'no'.");
        }

        if (countExtrovert > countIntrovert) {
            return CharacterType.EXTROVERT;
        } else if (countIntrovert > countExtrovert) {
            return CharacterType.INTROVERT;
        } else if (countAmbivert > 0) {
            return CharacterType.AMBIVERT;
        } else {
            return CharacterType.OMNIVERT;
        }
    }

    public static void main(String[] args) {
        CharacterType characterType = determineCharacterType();
        System.out.println("Your character type is: " + characterType);
    }
}

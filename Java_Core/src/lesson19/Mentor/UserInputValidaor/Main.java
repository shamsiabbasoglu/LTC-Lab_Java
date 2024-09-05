package lesson19.Mentor.UserInputValidaor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator();

        while (true) {
            System.out.print("Enter input (press 'Enter' to exit): ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                break;
            }

            InputCategory category = validator.categorize(input);
            if (category != null) {
                System.out.println("Category for \"" + input + "\": " + category.getCategoryName());
            } else {
                System.out.println("Invalid input: \"" + input + "\"");
            }
        }
    }
}

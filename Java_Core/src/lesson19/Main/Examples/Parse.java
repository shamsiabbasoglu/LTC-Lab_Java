package lesson19.Main.Examples;

import java.util.Scanner;

public class Parse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your age: ");
        String input = scanner.nextLine();
        int inputtedToInteger = Integer.parseInt(input);
        System.out.println("Missing year to 18: " + (18 - inputtedToInteger));
    }
}

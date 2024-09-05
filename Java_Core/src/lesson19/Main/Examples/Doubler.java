package lesson19.Main.Examples;

import java.util.Scanner;

public class Doubler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give an integer:");
        int input = scanner.nextInt();
        Integer inputtedInteger = Integer.valueOf(input);
        Double inputtedToDouble = Double.valueOf(inputtedInteger);
        System.out.println(inputtedToDouble);
    }
}

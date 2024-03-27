package lesson10.Main;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string: ");
        String string = scanner.nextLine();

        int chars = countCharacters(string);
        System.out.println("Number of characters (excluding whitespaces): " + chars);

        System.out.println(string.toUpperCase());

        System.out.println(string.toLowerCase());

        if (string.startsWith("A")) {
            System.out.println("String starts with 'A'.");
        } else {
            System.out.println("String don't start with 'A'.");
        }

        if (string.endsWith("Z")) {
            System.out.println("String ends with 'Z'.");
        } else {
            System.out.println("String don't end with 'Z'.");
        }

        System.out.println(string.replaceAll("e", "E"));

        String[] wordsArray = split(string);
        for (String word: wordsArray) {
            System.out.print(word + " ");
        }

        System.out.println("\n" + "The index of first occurrence of 'o' is: " + findIndex(string, 'o'));

        System.out.println("Extracted substring: " + string.substring(4, 10));

        System.out.println(string.trim());

    }

    public static int countCharacters(String str) {
        String stringWithoutSpaces = str.replaceAll("\\s", "");
        return stringWithoutSpaces.length();
    }

    public static String[] split(String str) {
        return str.split("\\s+");
    }

    public static int findIndex(String str, char letter) {
        return str.indexOf(letter);
    }
}

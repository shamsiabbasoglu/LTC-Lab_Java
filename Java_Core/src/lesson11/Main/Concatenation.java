package lesson11.Main;

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String name = scanner.nextLine();
        System.out.println("Enter last name: ");
        String surname = scanner.nextLine();

        String fullName = name.concat(" ").concat(surname);

        System.out.println(fullName);
    }
}

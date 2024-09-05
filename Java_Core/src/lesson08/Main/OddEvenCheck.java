package lesson08.Main;

import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (even(input)) System.out.println(input + " is even.");
        else System.out.println(input + " is odd.");
    }

    public static boolean even(int number) {
        return number % 2 == 0;
    }
}

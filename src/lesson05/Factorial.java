package lesson05;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer(out of 10): ");
        int num = scan.nextInt();
        if (num<0 || num>10) {
            System.out.println("Invalid input! Please choose integer between 1-10.");
            return;
        }
        int factor = 1;

        for (int i = 1; i <= num ; i++) {
            factor *= i;
        }
        System.out.println(factor);
    }
}

package lesson08.Mentor;

import java.util.Scanner;

public class FlourTaskMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of 1-kilo bags: ");
        int smallCount = scanner.nextInt();
        System.out.println("Enter the amount of 5-kilo bags: ");
        int bigCount = scanner.nextInt();
        System.out.println("Enter the goal weight: ");
        int goal = scanner.nextInt();

        if (smallCount < 0 || bigCount < 0 || goal < 0) {
            System.out.println("Invalid input. Inputs cant be negative.");
        } else if (canPack(smallCount, bigCount, goal)) {
            System.out.println("The " + goal + " kilos is achievable with given amount of bags.");
        } else {
            System.out.println("The " + goal + " kilos is not achievable with given amount of bags.");
        }
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int big = bigCount * 5;
        if (big + smallCount >= goal) {
            return goal % 5 <= smallCount;
        }
        return false;
    }
}

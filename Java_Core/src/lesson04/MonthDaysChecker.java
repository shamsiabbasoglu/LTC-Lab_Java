package lesson04;

import java.util.Scanner;

public class MonthDaysChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a month name: ");
        String month = scan.nextLine();
        String lower = month.toLowerCase();
        int days;
        switch (lower) {
            case "january", "march", "may", "july", "august", "october", "december":
                days = 31;
                break;
            case "april", "june", "september", "november":
                days = 30;
                break;
            case "february":
                days = 28;
                break;
            default:
                System.out.println("Undefined month!");
                return;
        }
        System.out.println("There are " + days + " days in " + lower);
    }
}


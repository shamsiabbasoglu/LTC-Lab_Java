package lesson06.Mentor;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type any number: ");
        String num = scan.nextLine();
        String reverseNum = "";
        int numLength = num.length();
        for (int i = (numLength - 1); i >= 0; i--) reverseNum += num.charAt(i);
        if (num.equals(reverseNum)) {
            System.out.println(num + " is Palindrome number.");
        } else {
            System.out.println(num + " is not Palindrome number.");
        }
    }
}

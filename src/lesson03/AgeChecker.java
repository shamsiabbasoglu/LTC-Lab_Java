package lesson03;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Yaşınızı yazın: ");
        int num1 = src.nextInt();

        if (num1 <= 18 && num1 > 0) {
            System.out.println("Siz uşaqsınız");
        } else if (num1 <= 35 && num1 > 18) {
            System.out.println("Siz cavansınız");
        } else if (num1 > 35) {
            System.out.println("Siz qocasınız");
        } else {
            System.out.println("Yaş 1-den kiçik ola bilmez!");
        }
    }
}



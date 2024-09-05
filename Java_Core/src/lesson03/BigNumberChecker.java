package lesson03;

import java.util.Scanner;

public class BigNumberChecker {
    public static void main(String[] args) {
        System.out.println("Give 3 integer: ");
        Scanner src = new Scanner(System.in);
        int a = src.nextInt();
        int b = src.nextInt();
        int c = src.nextInt();
        if (a>b && a>c) {
            System.out.println(a);
        } else if (b>c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

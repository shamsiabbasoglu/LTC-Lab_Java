package lesson05;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scan.nextInt();

        for (int i = 1; i < 10; i++) {
            int multi = num * i;
            System.out.println(num + " * " + i + " = " + multi);
        }
    }
}

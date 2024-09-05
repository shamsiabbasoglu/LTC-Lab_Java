package lesson04;

import java.util.Scanner;

public class GradeScaleIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter exam score(out of 100): ");
        int a = scan.nextInt();

        if (a < 0 || a > 100) {
            System.out.println("Invalid score!");
        } else {
            if (a >= 91) {
                System.out.println("Your letter grade is: A");
            } else if (a >= 81) {
                System.out.println("Your letter grade is: B");
            } else if (a >= 71) {
                System.out.println("Your letter grade is: C");
            } else if (a >= 61) {
                System.out.println("Your letter grade is: D");
            } else {
                System.out.println("Your letter grade is: F");
            }
        }
    }
}
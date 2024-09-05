package lesson04;

import java.util.Scanner;

public class GradeScaleSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter exam score(out of 100): ");
        int a = scan.nextInt();

        if (a < 0 || a > 100) {
            System.out.println("Invalid score!");
            return;
        }

        switch ((a - 1) / 10) {
            case 9:
                System.out.println("Your score is A");
                break;
            case 8:
                System.out.println("Your score is B");
                break;
            case 7:
                System.out.println("Your score is C");
                break;
            case 6:
                System.out.println("Your score is D");
                break;
            case 5, 4, 3, 2, 1, 0:
                System.out.println("Your score is F");
                break;
        }
    }
}

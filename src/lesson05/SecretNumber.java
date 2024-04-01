package lesson05;

import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int random = (int) (Math.random() * 100 +1);
        System.out.println("Guess the number(out of 100): ");
        int num;

        do {
            num = scan.nextInt();
            if (num>random) {
                System.out.println("Too high! Try again.");
            } else if (num<random){
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations!!! You guessed correct number!");
            }
        } while (num != random);
    }
}

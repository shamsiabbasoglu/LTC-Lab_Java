package lesson03;

import java.util.Scanner;

public class DogNightProblem {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("İt hürürmü? hürürse - 1, hürmürse - 0 yazın");
        int a = src.nextInt();
        System.out.println("Gecedirmi? gecedirse - 1, gece deyilse - 0 yazın");
        int b = src.nextInt();
        if ( a == 1 && b == 1) {
            System.out.println("Problem var!");
        } else {
            System.out.println("Problem yoxdur");
        }
    }
}

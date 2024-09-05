package lesson03;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        // Task addım 1. input hazırla
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tam eded yazın: ");
        int num1 = scan.nextInt();

        //Task addım 2 ve 3ü yerine yetiririk, verilen 10dan böyükdürse menfiye çeviririk
        if (num1 > 10) {
            System.out.println("Verilen reqem: " + -num1 + " (Verilen +10 -dan böyük olduğu üçün menfi deyere çevrildi)");
        } else {
            num1 = - num1;
            System.out.println("Verilen reqem: " + num1);
        }

        // Task addım 4. Tek cüt kontrolunu edirik ve istifadeçiye neticeni gösteririk
        if ((num1 % 2) == 0) {
            System.out.println("Verilen reqem cüttür");
        } else {
            System.out.println("Verilen reqem tekdir");
        }

        // Task addım 5.
        System.out.println("Kesirli bir reqem yazın");
        double num3 = scan.nextDouble(); //4.33
        System.out.println("Tam ve kesirli verilenlerin cemi: ");
        double sum1 = num1 +  num3;
        System.out.println(sum1);

        // Task addım 6. 1-6 random ve tam sayıyla sum
        int random = (int) (Math.random() * 6 + 1);
        System.out.println("Tesadüfi seçilen reqem: " + random);
        double sum2 = sum1 + random;
        System.out.println("Tesadüfi seçilen reqemle evvelki cemin cemi: " + sum2);

        // Task addım 7. neticeni hesabla, göster, deyerlendir.
        if (sum2 > 20) {
            System.out.println("Yekun netice 20-den böyükdür!");
        } else {
            System.out.println("Yekun netice 20-den böyük deyil!");
        }
    }
}
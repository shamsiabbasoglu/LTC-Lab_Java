package lesson03;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("1-10 aralığında bir tam eded texmin edin: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("Seçdiyiniz reqem: " + num1);

        // Task addım 2. random eded teyin et, göster
        int random = (int) (Math.random() * 10 + 1);
        System.out.println("Tesadüfi seçilen reqem: " + random);

        //Task addım 3 yox sayılır. addım 4. verilenle seçileni qarşılaşdır.
        if (num1 == random) {
            System.out.println("Tebrikler!!! Reqemi doğru texmin etdiniz!");
        } else if (num1 > random) {
            System.out.println("Texmin etdiyiniz reqem tesadüfi seçilen reqemden böyükdür.");
        } else {
            System.out.println("Texmin etdiyiniz reqem tesadüfi seçilen reqemden kiçikdir.");
        }
    }
}

package lesson02;

import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("İL AY HEFTE GÜN HESABLAYICI");
        System.out.println("Gün sayısını daxil edin: ");

        int a = src.nextInt();
        System.out.println("Verilenin il ay hefte gün şeklinde ifadesi: ");
        int year = a / 365;
//        375 1 il ı hefte 3 gun
        int month = (a % 365) / 30;
        int week = ((a % 365) % 30) / 7;
        int day = (((a % 365) % 30) % 7);
        System.out.println(year + " il " + month + " ay " + week + " hefte " + day + " gün");
    }
}

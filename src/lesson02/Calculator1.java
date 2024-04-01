package lesson02;

import java.util.Scanner;

public class Calculator1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İki tam reqem daxil edin: ");

        int num1, num2;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        int sum = num1 + num2;
        int sub = num1 - num2;
        int multiply = num1 * num2;
        int divide = num2 == 0 ? 0 : num1 / num2;

        System.out.println("Verilenlerin cemi: " + sum);
        System.out.println("Verilenlerin ferqi: " + sub);
        System.out.println("Verilenlerin hasili: " + multiply);
        System.out.println(num2 == 0 ? "İkinci deyer sıfır ola bilmez!" :  "Verilenlerin qismeti: " + divide);
    }

}

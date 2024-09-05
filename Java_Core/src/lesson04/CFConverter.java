package lesson04;

import java.util.Scanner;

public class CFConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Get user input
        System.out.println("Enter temperature unit(C or F): ");
        char unit = scan.next().charAt(0);

        //Perform conversion and display the result
        if (unit == 'C') {
            System.out.println("Enter temperature value: ");
            double a = scan.nextDouble();
            double b = (a * 9/5) + 32;
            System.out.println(a + " Celsius is " + b + " Fahrenheit");
        } else if (unit == 'F') {
            System.out.println("Enter temperature value: ");
            double a = scan.nextDouble();
            double b = (a - 32) * 5/9;
            System.out.println(a + " Fahrenheit is " + b + " Celsius");
        } else {
            System.out.println("Invalid input! Please enter 'C' or 'F' as a input!");
        }
    }
}

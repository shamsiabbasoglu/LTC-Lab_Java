package lesson06.Main;

import java.util.Arrays;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type grocery products: ");
        String input = scan.nextLine();

        String[] list = {Arrays.toString(input.split(" "))};
        for (String grocery : list) {
            System.out.println(grocery);
        }
    }
}

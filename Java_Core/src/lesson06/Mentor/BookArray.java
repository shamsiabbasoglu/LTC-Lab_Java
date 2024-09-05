package lesson06.Mentor;

import java.util.Arrays;
import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = new String[3];
        System.out.println("Type name of your favourite book: ");
        array[0] = scan.nextLine();
        System.out.println("Type name of publisher of your favourite book: ");
        array[1] = scan.nextLine();
        System.out.println("Type public date of your favourite book: ");
        array[2] = scan.nextLine();
        System.out.println(Arrays.toString(array));
    }
}

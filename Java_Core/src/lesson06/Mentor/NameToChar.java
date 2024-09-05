package lesson06.Mentor;

import java.util.Arrays;
import java.util.Scanner;

public class NameToChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = scan.next();
        char[] array = new char[name.length()];
        for (int i = 0; i < name.length(); i++) {
            array[i] = name.charAt(i);
        }
        System.out.println(Arrays.toString(array));
        }
    }

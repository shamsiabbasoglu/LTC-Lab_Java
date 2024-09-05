package lesson07.Mentor;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] array = new String[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = "Empty";
            }
        }

        System.out.println("Please enter a string:");
        String input = scanner.nextLine();

        int row, col;
        while (true) {
            System.out.println("Enter the row (1-" + array.length + ") where you want to place the string:");
            row = scanner.nextInt();
            System.out.println("Enter the column (1-" + array.length + ") where you want to place the string:");
            col = scanner.nextInt();

            if (row >= 1 && row < 4 && col >= 1 && col < 4) {
                break;
            } else {
                System.out.println("Invalid row or column. Please enter valid value.");
            }
        }

        array[row - 1][col - 1] = input;

        System.out.println("Updated array:");
        for (String[] rowArray : array) {
            for (String element : rowArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

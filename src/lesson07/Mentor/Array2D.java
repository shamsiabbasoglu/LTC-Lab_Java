package lesson07.Mentor;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {

        int[][] array = new int[3][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100 + 1);
            }
            Arrays.sort(array[i]);
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

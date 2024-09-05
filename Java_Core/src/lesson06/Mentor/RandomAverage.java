package lesson06.Mentor;

import java.util.Arrays;

public class RandomAverage {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 100 + 1);
            array[i] = random;
        }
        System.out.println("Randomly generated numbers are: " + "\n" + Arrays.toString(array));
        double sum = 0;
        for (int j : array) {
            sum += j;
        }
        System.out.println("Summary of random numbers: " + sum);
        double average = sum / array.length;
        System.out.println("Average value of the randomly generated numbers are: " + average);
    }
}

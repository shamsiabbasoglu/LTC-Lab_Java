package lesson06.Mentor;

import java.util.Arrays;

public class LowerToHigher {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 100 + 1);
            array[i] = random;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

package lesson06.Main;

public class RandomLarge {
    public static void main(String[] args) {
        int max;
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 100 + 1);
            numbers[i] = random;
        }
        System.out.println("Randomly generated numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        max = numbers[0];
        for (int number : numbers) {
            max = Math.max(max, number);
        }
        System.out.println("The largest number among randomly generated is: " + max);

    }
}

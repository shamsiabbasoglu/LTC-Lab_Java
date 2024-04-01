package lesson05;

public class SumEvens {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (num <= 100) {
            num++;
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("Sum of all evens between 1 and 100 is: " + sum);
    }
}

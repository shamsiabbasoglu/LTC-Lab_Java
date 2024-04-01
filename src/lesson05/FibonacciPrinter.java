package lesson05;

public class FibonacciPrinter {
    public static void main(String[] args) {
        int f0 = 0;
        int f1 = 1;
        System.out.println(f0);
        System.out.println(f1);

        for (int i=1; i<=8; i++) {
            int f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
            System.out.println(f2);
        }
    }
}

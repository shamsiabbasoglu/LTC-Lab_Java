package lesson03;

public class OddEvenChecker {
    public static void main(String[] args) {
        int rand = (int) (Math.random() * 100);
        System.out.println(rand);
        if (rand % 2 == 0) {
            System.out.println("Tesadüfi seçilen reqem cüttür");
        } else {
            System.out.println("Tesadüfi seçilen reqem tekdir");
        }
    }
}

package lesson19.Main.Examples;

public class Unboxing {
    public static void main(String[] args) {
        int number = 10;
        Integer integer = Integer.valueOf(number);
        System.out.println(integer);
        int parsedInteger = integer;
        System.out.println(parsedInteger);
    }
}

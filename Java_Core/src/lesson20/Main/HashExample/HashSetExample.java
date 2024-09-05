package lesson20.Main.HashExample;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(9);
        numbers.add(5);
        numbers.add(4);
        numbers.add(9);

        for (Integer number: numbers) {
            System.out.println(number);
        }
    }
}

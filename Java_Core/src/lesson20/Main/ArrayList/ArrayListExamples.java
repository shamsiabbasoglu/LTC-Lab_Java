package lesson20.Main.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Strawberry");
        list.add("Watermelon");
        list.add("Melon");

        for (String fruits: list) {
            System.out.println(fruits);
        }
    }
}

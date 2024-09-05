package lesson18.Main.StringExamples;

import java.time.Year;

public class EStringExamples {
    public static void main(String[] args) {
        String string = "Veni, vidi, vici";
        System.out.println(string.length());

        StringBuilder stringBuilder = new StringBuilder("Welcome to the Paris Olympics!");
        int currentYear = Year.now().getValue();
        stringBuilder.insert(0, currentYear + ": ");
        System.out.println(stringBuilder);
    }
}

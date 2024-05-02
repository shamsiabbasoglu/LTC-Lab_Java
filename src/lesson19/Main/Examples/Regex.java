package lesson19.Main.Examples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\bS\\w*\\b");
        Matcher matcher = pattern.matcher(input);

        System.out.println("Words starting with 'S': ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

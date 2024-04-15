package lesson14.Main.StringUtil;

public class Main {
    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil();

        // Test concatenate method
        String concatenated = stringUtil.manipulate("Hello, ", "World!");
        System.out.println("Concatenated string: " + concatenated);

        // Test concatenate method with three strings
        String concatenatedThree = stringUtil.manipulate("Hello, ", "Beautiful ", "World!");
        System.out.println("Concatenated three strings: " + concatenatedThree);

        // Test toUpperCase method
        String upperCase = stringUtil.manipulate("hello");
        System.out.println("Uppercase string: " + upperCase);
    }
}

package lesson14.Main.StringUtil;

public class Main {
    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil();

        // Test concatenate method with three strings
        String concatenated = stringUtil.manipulate("Hello, ", "Beautiful ", "World!");
        System.out.println("Concatenated three string: " + concatenated);

        // Test concatenate method with four strings
        String concatenatedThree = stringUtil.manipulate("Hello, ", "Beautiful ", "Great ", "World!");
        System.out.println("Concatenated four strings: " + concatenatedThree);

        // Test toUpperCase method
        String upperCase = stringUtil.manipulate("hello, ", "world!");
        System.out.println("Uppercase string: " + upperCase);

        // Test reverse method
        String reversal = stringUtil.manipulate("hello");
        System.out.println("Reversed string: " + reversal);
    }
}

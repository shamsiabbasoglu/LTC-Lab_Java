package lesson18.Main.StringExamples;

public class StringExamples {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " world!";
        String str3 = str1.concat(str2);

        System.out.println(str3);
        System.out.println(str3.substring(6, 12));

        StringBuilder stringBuilder = new StringBuilder("Veni, vidi, vici");
        String name = "Julius Caesar";
        stringBuilder.append(" - ").append(name);
        System.out.println(stringBuilder);
    }
}

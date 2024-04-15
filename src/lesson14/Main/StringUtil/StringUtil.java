package lesson14.Main.StringUtil;

public class StringUtil {
    // Method to concatenate three strings
    public String manipulate(String str1, String str2, String str3) {
        return str1.concat(str2).concat(str3);
    }

    // Method to concatenate four strings
    public String manipulate(String str1, String str2, String str3, String str4) {
        return str1.concat(str2).concat(str3).concat(str4);
    }

    // Method to convert a string to uppercase
    public String manipulate(String str1, String str2) {
        return str1.toUpperCase().concat(str2.toUpperCase());
    }

    // Method to reverse string
    public String manipulate(String str) {
        String reversedStr = "";
        for (int i = 0; i < str.length(); i++) {
            reversedStr = str.charAt(i) + reversedStr;
        }
        return reversedStr;
    }
}

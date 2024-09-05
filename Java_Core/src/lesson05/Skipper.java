package lesson05;

public class Skipper {
    public static void main(String[] args) {
        for (int i = 6; i < 17 ; i++) {
            if (i == 13) {
                continue;
            }
            System.out.println(i);
        }
    }
}

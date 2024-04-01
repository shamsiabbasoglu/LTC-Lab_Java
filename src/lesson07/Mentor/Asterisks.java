package lesson07.Mentor;

public class Asterisks {
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package lesson17.Main.Printer;

public class OddPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10000; i += 2) {
            System.out.println(i);
        }
    }
}

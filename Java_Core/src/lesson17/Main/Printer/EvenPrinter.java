package lesson17.Main.Printer;

public class EvenPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 10000; i += 2) {
            System.out.println(i);
        }
    }
}

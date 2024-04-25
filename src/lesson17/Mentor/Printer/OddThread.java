package lesson17.Mentor.Printer;

public class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                System.err.println("OddThread interrupted");
            }
        }
    }
}

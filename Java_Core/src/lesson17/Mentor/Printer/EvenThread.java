package lesson17.Mentor.Printer;

public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                System.err.println("EvenThread interrupted");
            }
        }
    }
}

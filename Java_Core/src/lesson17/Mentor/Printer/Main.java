package lesson17.Mentor.Printer;

public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();
        evenThread.start();
        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted");
        }
    }
}

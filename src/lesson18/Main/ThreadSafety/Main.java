package lesson18.Main.ThreadSafety;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int iterations = 1000000;
        int n = 5;

        StringBuilderTest[] stringBuilderTest = new StringBuilderTest[n];
        for (int i = 0; i < n; i++) {
            stringBuilderTest[i] = new StringBuilderTest(iterations);
            stringBuilderTest[i].start();
        }
        for (int i = 0; i < n; i++) {
            stringBuilderTest[i].join();
        }

        StringBufferTest[] stringBufferTests = new StringBufferTest[n];
        for (int i = 0; i < n; i++) {
            stringBufferTests[i] = new StringBufferTest(iterations);
            stringBufferTests[i].start();
        }
        for (int i = 0; i < n; i++) {
            stringBufferTests[i].join();
        }
    }
}

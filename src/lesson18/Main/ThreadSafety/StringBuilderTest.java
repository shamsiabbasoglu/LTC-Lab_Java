package lesson18.Main.ThreadSafety;

public class StringBuilderTest extends Thread {
    private final StringBuilder stringBuilder;
    private final int iterations;

    public StringBuilderTest(int iterations) {
        this.stringBuilder = new StringBuilder();
        this.iterations = iterations;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        stringBuilder.append("a".repeat(Math.max(0, iterations)));
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (endTime - startTime) + "ms");
    }
}
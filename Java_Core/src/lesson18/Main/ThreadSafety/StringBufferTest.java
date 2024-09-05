package lesson18.Main.ThreadSafety;

public class StringBufferTest extends Thread{
    private final StringBuffer stringBuffer;
    private final int iterations;

    public StringBufferTest(int iterations) {
        this.stringBuffer = new StringBuffer();
        this.iterations = iterations;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            synchronized (stringBuffer) {
                stringBuffer.append("a");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (endTime - startTime) + "ms");
    }
}

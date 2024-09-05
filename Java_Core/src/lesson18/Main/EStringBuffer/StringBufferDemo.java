package lesson18.Main.EStringBuffer;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();

        String[] strings = {"Lorem", "ipsum", "dolor", "sit", "amet,", "consectetur", "adipiscing", "elit."};

        Thread[] threads = new Thread[strings.length];

        for (int i = 0; i < strings.length; i++) {
            final int index = i;
            threads[i] = new Thread(() -> {
                synchronized (buffer) {
                    buffer.append(strings[index]);
                    buffer.append(" ");
                }
            });
            threads[i].start();
        }

        for (Thread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(buffer);
    }
}

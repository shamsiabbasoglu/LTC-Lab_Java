package lesson10.Main;

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        GarbageCollectionDemo demo = new GarbageCollectionDemo();
        demo.runGarbageCollector();
    }
    public void runGarbageCollector() {
        //example object and its interaction vs collector
        MyClass demo = new MyClass();
        demo = null;
        System.gc();
    }

    static class MyClass {
        //placeholder class
    }
}

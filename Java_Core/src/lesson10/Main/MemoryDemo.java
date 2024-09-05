package lesson10.Main;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MemoryDemo {
    public static void main(String[] args) {
        MemoryDemo demo = new MemoryDemo();
        demo.stackVsHeap();
    }
    public void stackVsHeap() {
        //Stack memory: primitives
        int number = 2;
        double decimal = 1.23;
        boolean boo = true;

        //stack memory examples would print out actual values
        System.out.println(number);
        System.out.println(decimal);
        System.out.println(boo);

        //Heap memory: objects/reference types
        Scanner scanner = new Scanner(System.in);
        Array[] arrays = new Array[0];

        //heap memory examples would print references to that objects
        System.out.println(scanner);
        System.out.println(arrays);
    }
}
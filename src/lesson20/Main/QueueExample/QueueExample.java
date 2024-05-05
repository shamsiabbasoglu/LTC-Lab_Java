package lesson20.Main.QueueExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();

        tasks.offer("Task 1: Wash the food");
        tasks.offer("Task 2: Peel and clean all");
        tasks.offer("Task 3: Cook a meal");

        while (!tasks.isEmpty()) {
            System.out.println("Processing and completing: " + tasks.poll());
        }
    }
}

package lesson26.Mentor.Exam;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>(List.of(
                new Task("Design User Interface (1 hour)", 1),
                new Task("Write Software Documentation (12 hours)", 12),
                new Task("Research New Technologies (2 hours)", 2),
                new Task("Develop Mobile App Features (9 hours)", 9),
                new Task("Debug Codebase (7 hours)", 7),
                new Task("Test Application Performance (6 hours)", 6),
                new Task("Deploy Software Updates (10 hours)", 10),
                new Task("Meet with Project Stakeholders (5 hours)", 5),
                new Task("Create Presentation Slides (3 hours)", 3),
                new Task("Create Presentation Slides (3 hours)", 3)
        ));

//        for (Task task : tasks) {
//            System.out.print(task);
//        }

        System.out.println();
        TaskManager manager = new TaskManager();
        tasks.forEach(t -> {
            try {
                manager.addTask(t);
            } catch (DuplicateTaskException e) {
                System.out.println(e.getMessage());
            }
        });
        manager.removeTask("Meet with Project Stakeholders (5 hours)");
        System.out.println(manager);
    }
}

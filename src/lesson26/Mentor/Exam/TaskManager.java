package lesson26.Mentor.Exam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        if (!tasks.contains(task)) {
            tasks.add(task);
        } else {
            throw new DuplicateTaskException("This task already exists.");
        }
    }

    public void removeTask(String text) {
        tasks.removeIf(task -> task.getText().equals(text));
    }

    @Override
    public String toString() {
        tasks.sort(Comparator.comparing(Task::getPriority));
        StringBuilder stringBuilder = new StringBuilder();
        for (Task task : tasks) {
            stringBuilder.append(task);
        }
        return stringBuilder.toString();
    }
}
package lesson26.Mentor.Exam;

import java.util.Objects;

public class Task {
    private final String text;
    private final PriorityLevel priority;

    public Task(String text, int priority) {
        this.text = text;
        if (priority <= 4) {
            this.priority = PriorityLevel.LOW;
        } else if (priority >= 8) {
            this.priority = PriorityLevel.HIGH;
        } else {
            this.priority = PriorityLevel.MEDIUM;
        }
    }

    public String getText() {
        return text;
    }

    public PriorityLevel getPriority() {
        return priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(text, task.text) && priority == task.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, priority);
    }

    @Override
    public String toString() {
        return text + " " + priority + "\n";
    }
}

package lesson14.Mentor.TimeDifferenceCalculator;

public class Main {
    public static void main(String[] args) {
        TimeCalculator calculator = new TimeCalculator();

        calculator.calculateDifference(10, 25, 15, 15);

        calculator.calculateDifference("05:00", "08:15");
        calculator.calculateDifference("11:00", "08:00"); // Reversed time
        calculator.calculateDifference("25:00", "17:00"); // Invalid time
    }
}

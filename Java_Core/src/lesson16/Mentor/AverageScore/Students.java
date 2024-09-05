package lesson16.Mentor.AverageScore;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Students {
    private final int[] scores;
    private final int numberOfStudents;
    private final Scanner scanner;


    public Students(int numberOfStudents) {
        this.scores = new int[numberOfStudents];
        this.numberOfStudents = numberOfStudents;
        this.scanner = new Scanner(System.in);
    }

    public void promptForScores() {
        int i = 0;
        while (i < numberOfStudents) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            try {
                int score = scanner.nextInt();
                if (score < 0 || score > 100) {
                    System.out.println("Score must be between 0 and 100.");
                } else {
                    scores[i] = score;
                    i++;
                }
            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter a valid score.");
            }
        }
    }

    public int sumOfScores(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum;
    }

    public double averageOfScores() {
        return 1.0 * sumOfScores(scores) / numberOfStudents;
    }
}

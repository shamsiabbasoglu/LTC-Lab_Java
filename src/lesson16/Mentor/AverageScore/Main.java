package lesson16.Mentor.AverageScore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        Students students = new Students(numberOfStudents);
        students.promptForScores();
        System.out.println("Average score of group of students: " + students.averageOfScores());
    }
}

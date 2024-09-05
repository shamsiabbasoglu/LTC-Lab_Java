package lesson04;

import java.util.Scanner;

public class GradeScaleTernary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter exam score(out of 100): ");
        int a = scan.nextInt();

        String grade = (a>=91&&a<=100) ? "A" : (a>=81&&a<=90) ? "B" : (a>=71&&a<=80) ? "C" : (a>=61&&a<=70) ? "D": (a>=0 && a<= 60) ? "F": "0";
        System.out.println((a<0 || a>100) ? "Invalid score" : "Your grade is: " + grade);
    }
}

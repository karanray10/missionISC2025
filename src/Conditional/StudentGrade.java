package Conditional;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mark in Computer Science (0-100): ");
        int mark = scanner.nextInt();
        if (mark < 0 || mark > 100) {
            System.out.println("Invalid mark. Please enter a value between 0 and 100.");
        } else {
            String grade;
            if (mark > 90) {
                grade = "A";
            } else if (mark >= 70) {
                grade = "B";
            } else if (mark >= 50) {
                grade = "C";
            } else {
                grade = "D";
            }
            System.out.println("The grade for the mark " + mark + " is: " + grade);
        }
    }
}

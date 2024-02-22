package Conditional;

import java.util.Scanner;

public class MeanCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();

        System.out.println("Menu:");
        System.out.println("1. Arithmetic Mean");
        System.out.println("2. Geometric Mean");
        System.out.println("3. Harmonic Mean");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = (a + b) / 2;
                System.out.println("Arithmetic Mean: " + result);
                break;
            case 2:
                result = Math.sqrt(a * b);
                System.out.println("Geometric Mean: " + result);
                break;
            case 3:
                result = 2 * a * b / (a + b);
                System.out.println("Harmonic Mean: " + result);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}


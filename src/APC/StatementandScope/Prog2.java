package APC.StatementandScope;

import java.util.Scanner;

public class Prog2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Arithmetic Mean");
            System.out.println("2. Geometric Mean");
            System.out.println("3. Harmonic Mean");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    calculateArithmeticMean(scanner);
                    break;
                case 2:
                    calculateGeometricMean(scanner);
                    break;
                case 3:
                    calculateHarmonicMean(scanner);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }

    public static void calculateArithmeticMean(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double mean = (num1 + num2) / 2;
        System.out.println("Arithmetic Mean: " + mean);
    }

    public static void calculateGeometricMean(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double mean = Math.sqrt(num1 * num2);
        System.out.println("Geometric Mean: " + mean);
    }

    public static void calculateHarmonicMean(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error: Cannot calculate Harmonic Mean for zero values.");
            return;
        }
        double mean = (2 * num1 * num2) / (num1 + num2);
        System.out.println("Harmonic Mean: " + mean);
    }
}

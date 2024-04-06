package APC.StatementandScope;

import java.util.Scanner;

public class Prog8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower limit (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the upper limit (n): ");
        int n = scanner.nextInt();

        if (m < 0 || n < 0 || m > n || m >= 30000 || n >= 30000) {
            System.out.println("Invalid input (m, n must be positive and m <= n, both < 30000)");
        } else {
            int count = findUniqueDigitCount(m, n);
            System.out.println("The Unique-Digit integers are:");
            printUniqueDigits(m, n);
            System.out.println("\nFrequency of unique-digit integers is: " + count);
        }
    }

    public static int findUniqueDigitCount(int m, int n) {
        int count = 0;
        for (int i = Math.max(1, m); i <= Math.min(9, n); i++) {
            count++;
        }
        for (int i = Math.max(10, m); i <= n; i++) {
            int firstDigit = i / 10;
            int secondDigit = i % 10;
            if (firstDigit != secondDigit) {
                count++;
            }
        }
        return count;
    }

    public static void printUniqueDigits(int m, int n) {
        for (int i = Math.max(1, m); i <= Math.min(9, n); i++) {
            System.out.print(i + " ");
        for (int i = Math.max(10, m); i <= n; i++) {
            int firstDigit = i / 10;
            int secondDigit = i % 10;
            if (firstDigit != secondDigit) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

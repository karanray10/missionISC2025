package Loop;

import java.util.Scanner;

public class SumOfOddEvenDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }

            number /= 10;
        }

        System.out.println("Sum of even digits: " + sumEven);
        System.out.println("Sum of odd digits: " + sumOdd);

    }
}

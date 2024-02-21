package Conditional;

import java.util.Scanner;

public class FindSmallestTernary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Error: All numbers must be unique.");
            return;
        }

        int smallest = num1 < num2 ? num1 : num2;
        smallest = num3 < smallest ? num3 : smallest;

        System.out.println("The smallest number is: " + smallest);
    }
}


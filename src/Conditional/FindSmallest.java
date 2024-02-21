package Conditional;

import java.util.Scanner;

public class FindSmallest {

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
        int smallest;
        if (num1 < num2) {
            smallest = num1;
        } else {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        System.out.println("The smallest number is: " + smallest);
    }
}

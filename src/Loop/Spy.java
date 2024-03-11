package Loop;

import java.util.Scanner;

public class Spy {
    public static void main(String args[]) {
        int num, product = 1, sum = 0, lastDigit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        num = sc.nextInt();

        while (num > 0) {
            lastDigit = num % 10;
            sum += lastDigit;
            product *= lastDigit;
            num /= 10;
        }

        if (sum == product)
            System.out.println("The given number is a spy number.");
        else
            System.out.println("The given number is not a spy number.");
    }
}
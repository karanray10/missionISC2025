package Reccursion;

import java.util.Scanner;

public class Sum {
    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("The sum of digits of " + num + " is: " + sum);
    }
}


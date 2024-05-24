package Reccursion;

import java.util.Scanner;

public class HCF {
    public static int hcf(int a, int b) {
        if (b == 0)
            return a;
        return hcf(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int result = hcf(num1, num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + result);
    }
}

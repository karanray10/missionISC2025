package Loop;

import java.util.Scanner;

public class HCF{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int smaller = Math.min(num1, num2);
        int hcf = 1;
        for (int i = 1; i <= smaller; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("The HCF of " + num1 + " and " + num2 + " is " + hcf);

    }
}

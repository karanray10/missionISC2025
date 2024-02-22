package Conditional;

import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter gender (M/F): ");
        char gender = scanner.next().toUpperCase().charAt(0);

        System.out.print("Enter taxable income: ");
        double taxableIncome = scanner.nextDouble();

        if (age > 65 || gender != 'M') {
            System.out.println("Wrong category. Calculation not applicable.");
        } else {
            double taxPayable;
            if (taxableIncome <= 160000) {
                taxPayable = 0.0;
            } else if (taxableIncome <= 500000) {
                taxPayable = (taxableIncome - 160000) * 0.1;
            } else if (taxableIncome <= 800000) {
                taxPayable = (taxableIncome - 500000) * 0.2 + 34000;
            } else {
                taxPayable = (taxableIncome - 800000) * 0.3 + 94000;
            }
            System.out.printf("Income Tax Payable: ₹%.2f\n", taxPayable);
        }
    }
}

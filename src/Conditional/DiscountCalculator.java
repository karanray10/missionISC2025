package Conditional;

import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days within which the bill is to be paid: ");
        int days = scanner.nextInt();

        System.out.print("Enter the type of customer (D for dealer, R for retailer): ");
        char type = scanner.next().charAt(0);

        System.out.print("Enter the amount of purchase: ");
        double amount = scanner.nextDouble();

        double discount = 0;

        if (type == 'D') {
            if (days <= 30) {
                discount = 0.15;
            } else if (days <= 45) {
                discount = 0.12;
            } else if (days <= 60) {
                discount = 0.10;
            }
        } else if (type == 'R') {
            if (days <= 30) {
                discount = 0.10;
            } else if (days <= 45) {
                discount = 0.08;
            } else if (days <= 60) {
                discount = 0.05;
            }
        } else {
            System.out.println("Invalid customer type.");
            return;
        }

        double netAmount = amount - (amount * discount);

        System.out.println("Bill details:");
        System.out.println("Customer type: " + type);
        System.out.println("Amount of purchase: " + amount);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Net amount: " + netAmount);
    }
}


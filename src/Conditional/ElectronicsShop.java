package Conditional;

import java.util.Scanner;

public class ElectronicsShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter the amount of purchase (positive integer): ");
        int amount = scanner.nextInt();

        System.out.print("Enter the type of purchase (L for Laptop, D for Desktop): ");
        char purchaseType = scanner.next().toUpperCase().charAt(0);

        double discountRate = 0.0;
        double netAmount = 0.0;

        if (amount > 0 && (purchaseType == 'L' || purchaseType == 'D')) {
            if (amount <= 25000) {
                discountRate = (purchaseType == 'L') ? 0.0 : 5.0;
            } else if (amount <= 57000) {
                discountRate = (purchaseType == 'L') ? 5.0 : 7.5;
            } else if (amount <= 100000) {
                discountRate = (purchaseType == 'L') ? 7.5 : 10.0;
            } else {
                discountRate = (purchaseType == 'L') ? 10.0 : 15.0;
            }

            netAmount = amount - (amount * discountRate / 100);

            System.out.println("Customer Name: " + name);
            System.out.println("Customer Address: " + address);
            System.out.println("Net Amount to be Paid: ₹" + netAmount);
        } else {
            System.out.println("Invalid purchase details. Please try again.");
        }
    }
}


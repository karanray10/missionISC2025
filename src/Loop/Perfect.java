package Loop;

import java.util.Scanner;

public class Perfect {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                if (i != number / i) {
                    sum += i + number / i;
                } else {
                    sum += i;
                }
            }
        }
        if (sum == number && number > 1) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}

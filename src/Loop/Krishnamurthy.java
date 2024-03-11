package Loop;

import java.util.Scanner;

public class Krishnamurthy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int originalNum = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is a Krishnamurthy (Strong) number.");
        } else {
            System.out.println(originalNum + " is not a Krishnamurthy (Strong) number.");
        }
    }
}

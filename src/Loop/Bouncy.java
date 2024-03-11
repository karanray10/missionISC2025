package Loop;
import java.util.Scanner;

public class Bouncy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean increasing = false;
        boolean decreasing = false;

        int prevDigit = num % 10;
        num /= 10;

        while (num > 0) {
            int digit = num % 10;
            if (digit < prevDigit) {
                decreasing = true;
            } else if (digit > prevDigit) {
                increasing = true;
            }

            if (increasing && decreasing) {
                System.out.println("The number is a bouncy number.");
                return;
            }

            prevDigit = digit;
            num /= 10;
        }

        System.out.println("The number is not a bouncy number.");
    }
}

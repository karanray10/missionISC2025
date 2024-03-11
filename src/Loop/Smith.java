package Loop;
import java.util.Scanner;

public class Smith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int originalNum = num;
        int sumOfDigits = 0;
        while (num > 0) {
            sumOfDigits += num % 10;
            num /= 10;
        }
        int primeFactorsSum = 0;
        for (int i = 2; i <= originalNum; i++) {
            while (originalNum % i == 0) {
                primeFactorsSum += sumOfDigitsOfNumber(i);
                originalNum /= i;
            }
        }
        if (sumOfDigits == primeFactorsSum) {
            System.out.println("The number is a Smith number.");
        } else {
            System.out.println("The number is not a Smith number.");
        }
    }
    public static int sumOfDigitsOfNumber(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

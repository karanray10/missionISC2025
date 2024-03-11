package Loop;
import java.util.Scanner;

public class Duck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive non-zero number:");
        int number = sc.nextInt();

        int temp = number;
        boolean containsZero = false;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0) {
                containsZero = true;
                break;
            }
            temp /= 10;
        }
        boolean startsWithZero = (number % 10 == 0);

        if (containsZero && !startsWithZero) {
            System.out.println(number + " is a Duck number");
        } else {
            System.out.println(number + " is not a Duck number");
        }
    }
}

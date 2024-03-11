package Loop;
import java.util.Scanner;

public class Strontio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        int num = scanner.nextInt();

        if (num < 1000 || num > 9999) {
            System.out.println("Invalid input. Please enter a four-digit number.");
            return;
        }

        int product = num * 2;

        int originalHundreds = num / 100;
        int originalTens = (num / 10) % 10;

        int productHundreds = product / 100;
        int productTens = (product / 10) % 10;

        if (originalHundreds == productHundreds && originalTens == productTens) {
            System.out.println(num + " is a Strontio number.");
        } else {
            System.out.println(num + " is not a Strontio number.");
        }
    }
}

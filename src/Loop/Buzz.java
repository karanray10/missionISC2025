package Loop;
import java.util.Scanner;

public class Buzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        // Check whether the number ends with 7 or is divisible by 7
        if (number % 10 == 7 || number % 7 == 0)
            System.out.println(number + " is a Buzz number");
        else
            System.out.println(number + " is not a Buzz number");
    }
}


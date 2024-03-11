package Loop;

import java.util.Scanner;

public class Sunny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int nextNum = num + 1;
        int nextNumSquare = nextNum * nextNum;

        if (nextNumSquare == num + nextNum) {
            System.out.println(num + " is a Sunny number.");
        } else {
            System.out.println(num + " is not a Sunny number.");
        }
    }
}

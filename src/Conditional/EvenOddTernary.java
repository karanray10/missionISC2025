package Conditional;

import java.util.Scanner;

public class EvenOddTernary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        String evenOdd = (number % 2 == 0) ? "even" : "odd";

        System.out.println(number + " is " + evenOdd);

    }
}

package Basic;

import java.util.Scanner;

public class SquareArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();
        if (sideLength <= 0) {
            System.out.println("Invalid input: Side length must be positive.");
            return;
        }
        double area = sideLength * sideLength;
        System.out.printf("The area of the square is: %.2f square units.\n", area);
    }
}

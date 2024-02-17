package Basic;

import java.util.Scanner;

public class SquarePerimeter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();
        double perimeter = 4 * sideLength;
        System.out.println("The perimeter of the square is: " + perimeter);
    }
}

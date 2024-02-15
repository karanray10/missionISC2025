package Basic;

import java.util.Scanner;

public class EquilateralTrianglePerimeter {

    public static void main(String[] args) {
        // Get side length from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of the equilateral triangle: ");
        double sideLength = scanner.nextDouble();

        // Calculate the perimeter using side length
        double perimeter = 3 * sideLength;

        // Display the perimeter
        System.out.println("The perimeter of the equilateral triangle is: " + perimeter);
    }
}

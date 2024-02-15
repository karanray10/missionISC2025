package Basic;

import java.util.Scanner;

public class IsoscelesTrianglePerimeter {

    public static void main(String[] args) {
        // Get base and equal side length from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of the isosceles triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Enter the equal side length of the isosceles triangle: ");
        double equalSide = scanner.nextDouble();

        // Validate positive input
        if (base <= 0 || equalSide <= 0) {
            System.out.println("Invalid input: Sides must be positive numbers.");
            return;
        }

        // Calculate the perimeter
        double perimeter = 2 * equalSide + base;

        // Display the perimeter
        System.out.println("The perimeter of the isosceles triangle is: " + perimeter);
    }
}

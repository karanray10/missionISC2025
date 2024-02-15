import java.util.Scanner;

public class TrianglePerimeter {

    public static void main(String[] args) {
        // Get side lengths from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();

        // Validate triangle inequality (sum of any two sides must be greater than the third)
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            System.out.println("Invalid triangle: sum of any two sides must be greater than the third.");
            return;
        }

        // Calculate the perimeter
        double perimeter = side1 + side2 + side3;

        // Display the perimeter
        System.out.println("The perimeter of the triangle is: " + perimeter);
    }
}

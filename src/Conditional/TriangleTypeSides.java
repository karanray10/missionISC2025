package Conditional;

import java.util.Scanner;

public class TriangleTypeSides {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side (positive integer): ");
        int side1 = scanner.nextInt();

        System.out.print("Enter the second side (positive integer): ");
        int side2 = scanner.nextInt();

        System.out.print("Enter the third side (positive integer): ");
        int side3 = scanner.nextInt();

        // Check if sides can form a triangle
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invalid sides. All sides must be positive integers.");
            return;
        } else if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            System.out.println("Invalid sides. Each side must be less than the sum of the other two.");
            return;
        }
        int side1Squared = side1 * side1;
        int side2Squared = side2 * side2;
        int side3Squared = side3 * side3;
        boolean acute = (side1Squared < side2Squared + side3Squared) &&
                (side2Squared < side1Squared + side3Squared) &&
                (side3Squared < side1Squared + side2Squared);
        boolean right = (side1Squared == side2Squared + side3Squared) ||
                (side2Squared == side1Squared + side3Squared) ||
                (side3Squared == side1Squared + side2Squared);
        boolean obtuse = !acute && !right;
        if (acute) {
            System.out.println("Acute Angled Triangle - All angles are acute.");
        } else if (right) {
            System.out.println("Right Angled Triangle - One angle is 90 degrees.");
        } else {
            System.out.println("Obtuse Angled Triangle - One angle is obtuse.");
        }
    }
}

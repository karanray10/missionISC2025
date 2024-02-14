package Basic;

import java.util.Scanner;

public class EquilateralTriangleArea {

    public static void main(String[] args) {
        // Get side length from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of the equilateral triangle: ");
        double side = scanner.nextDouble();

        // Calculate the area using the formula: sqrt(3) * side^2 / 4
        double area = Math.sqrt(3) * Math.pow(side, 2) / 4;

        // Display the area
        System.out.println("The area of the equilateral triangle is: " + area);
    }
}


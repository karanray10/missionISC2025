package Basic;

import java.util.Scanner;

public class EquilateralTrianglePerimeter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of the equilateral triangle: ");
        double sideLength = scanner.nextDouble();
        double perimeter = 3 * sideLength;
        System.out.println("The perimeter of the equilateral triangle is: " + perimeter);
    }
}

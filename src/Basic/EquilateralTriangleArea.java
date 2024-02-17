package Basic;

import java.util.Scanner;

public class EquilateralTriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of the equilateral triangle: ");
        double side = scanner.nextDouble();
        double area = Math.sqrt(3) * Math.pow(side, 2) / 4;
        System.out.println("The area of the equilateral triangle is: " + area);
    }
}


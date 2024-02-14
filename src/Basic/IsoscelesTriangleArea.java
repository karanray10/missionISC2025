package Basic;

import java.util.Scanner;

public class IsoscelesTriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one of the equal sides of the triangle: ");
        double side = scanner.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double area = Math.sqrt(Math.pow(side, 2) - Math.pow(height / 2, 2)) * height / 2;
        System.out.println("The area of the isosceles triangle is: " + area);
    }
}

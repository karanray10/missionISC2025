package Basic;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        // Get the length and width from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        // Calculate the area using the formula: length * width
        double area = length * width;

        // Display the area
        System.out.println("The area of the rectangle is: " + area);
    }
}

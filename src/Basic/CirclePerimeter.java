package Basic;

import java.util.Scanner;

public class CirclePerimeter {

    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double perimeter = 2 * PI * radius;
        System.out.println("The perimeter of the circle is: " + perimeter);
    }
}

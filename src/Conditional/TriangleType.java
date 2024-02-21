package Conditional;

import java.util.Scanner;

public class TriangleType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first angle (degrees): ");
        int angle1 = scanner.nextInt();

        System.out.print("Enter the second angle (degrees): ");
        int angle2 = scanner.nextInt();

        System.out.print("Enter the third angle (degrees): ");
        int angle3 = scanner.nextInt();
        int sumAngles = angle1 + angle2 + angle3;
        if (sumAngles != 180) {
            System.out.println("Invalid triangle. The sum of angles must be 180 degrees.");
            return;
        }
        if (angle1 == angle2 && angle2 == angle3) {
            System.out.println("Equilateral Triangle - All angles are equal.");
        } else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
            System.out.println("Isosceles Triangle - Two angles are equal.");
        } else {
            System.out.println("Scalene Triangle - All angles are different.");
        }
    }
}


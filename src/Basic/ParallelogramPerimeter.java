package Basic;

import java.util.Scanner;

public class ParallelogramPerimeter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of the parallelogram: ");
        double base = scanner.nextDouble();
        System.out.println("Enter the side length of the parallelogram: ");
        double sideLength = scanner.nextDouble();
        double perimeter = 2 * (base + sideLength);
        System.out.println("The perimeter of the parallelogram is: " + perimeter);
    }
}

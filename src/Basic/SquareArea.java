import java.util.Scanner;

public class SquareArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for side length
        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();

        // Validate positive input
        if (sideLength <= 0) {
            System.out.println("Invalid input: Side length must be positive.");
            return;
        }

        // Calculate the area
        double area = sideLength * sideLength;

        // Display the area with two decimal places
        System.out.printf("The area of the square is: %.2f square units.\n", area);
    }
}

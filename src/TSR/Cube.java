package TSR;

public class Cube {

    public static void main(String[] args) {
        // Get the side length from the user
        System.out.print("Enter the side length of the cube: ");
        double side = Double.parseDouble(System.console().readLine());

        // Calculate the surface area
        double surfaceArea = 6 * Math.pow(side, 2);

        // Print the result
        System.out.println("The surface area of the cube is: " + surfaceArea);
    }
}


package TSR;

public class Cylinder {

    public static void main(String[] args) {
        // Get the radius and height from the user
        System.out.print("Enter the radius of the cylinder: ");
        double radius = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the height of the cylinder: ");
        double height = Double.parseDouble(System.console().readLine());

        // Calculate the surface area
        double surfaceArea = 2 * Math.PI * radius * (radius + height);

        // Print the result
        System.out.println("The surface area of the cylinder is: " + surfaceArea);
    }
}


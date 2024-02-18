package Basic.TSR;

public class Cylinder {

    public static void main(String[] args) {
        System.out.print("Enter the radius of the cylinder: ");
        double radius = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the height of the cylinder: ");
        double height = Double.parseDouble(System.console().readLine());
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        System.out.println("The surface area of the cylinder is: " + surfaceArea);
    }
}


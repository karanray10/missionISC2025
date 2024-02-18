package Basic.TSR;

public class Sphere {

    public static void main(String[] args) {
        System.out.print("Enter the radius of the sphere: ");
        double radius = Double.parseDouble(System.console().readLine());
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("The surface area of the sphere is: " + surfaceArea);
    }
}


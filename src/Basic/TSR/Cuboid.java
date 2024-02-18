package Basic.TSR;

public class Cuboid {

    public static void main(String[] args) {
        System.out.print("Enter the length of the cuboid: ");
        double length = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the width of the cuboid: ");
        double width = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the height of the cuboid: ");
        double height = Double.parseDouble(System.console().readLine());
        double surfaceArea = 2 * (length * width + width * height + length * height);
        System.out.println("The surface area of the cuboid is: " + surfaceArea);
    }
}


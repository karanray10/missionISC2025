package Basic.TSR;

public class Cube {

    public static void main(String[] args) {
        System.out.print("Enter the side length of the cube: ");
        double side = Double.parseDouble(System.console().readLine());
        double surfaceArea = 6 * Math.pow(side, 2);
        System.out.println("The surface area of the cube is: " + surfaceArea);
    }
}


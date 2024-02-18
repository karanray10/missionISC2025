public class CuboidSurfaceArea {

    public static void main(String[] args) {
        double length = 6.0; // Replace with your actual length
        double width = 4.0; // Replace with your actual width
        double height = 3.0; // Replace with your actual height

        double surfaceArea = 2 * (length * width + width * height + length * height);

        System.out.println("Surface area of the cuboid: " + surfaceArea);
    }
}

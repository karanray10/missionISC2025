package Basic.CurveSurface;

public class CuboidSurfaceArea {

    public static void main(String[] args) {
        double length = 6.0;
        double width = 4.0;
        double height = 3.0;
        double surfaceArea = 2 * (length * width + width * height + length * height);
        System.out.println("Surface area of the cuboid: " + surfaceArea);
    }
}

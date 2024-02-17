package Volume;

public class Cuboid {

    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        double length = 7.0;
        double width = 4.0;
        double height = 3.0;
        double volume = calculateVolume(length, width, height);
        System.out.println("Volume of cuboid: " + volume);
    }
}

package Volume;

public class Cylinder {

    public static double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        double radius = 3.0;
        double height = 5.0;
        double volume = calculateVolume(radius, height);
        System.out.println("Volume of cylinder: " + volume);
    }
}

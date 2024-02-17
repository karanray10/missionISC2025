package Volume;

public class Sphere {

    public static double calculateVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {
        double radius = 2.0;
        double volume = calculateVolume(radius);
        System.out.println("Volume of sphere: " + volume);
    }
}

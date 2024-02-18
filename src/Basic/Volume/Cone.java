package Basic.Volume;

public class Cone {

    public static double calculateVolume(double radius, double height) {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double height = 10.0;
        double volume = calculateVolume(radius, height);
        System.out.println("Basic.Volume of cone: " + volume);
    }
}

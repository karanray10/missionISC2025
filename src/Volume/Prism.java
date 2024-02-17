package Volume;

public class Prism {

    public static double calculateVolume(double baseArea, double height) {
        return baseArea * height;
    }

    public static void main(String[] args) {
        double length = 4.0;
        double width = 3.0;
        double height = 2.0;
        double baseArea = length * width;
        double volume = calculateVolume(baseArea, height);
        System.out.println("Volume of rectangular prism: " + volume);
    }
}

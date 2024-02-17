package Volume;

public class Cube {

    public static double calculateVolume(double side) {
        return side * side * side;
    }

    public static void main(String[] args) {
        double side = 6.0;
        double volume = calculateVolume(side);
        System.out.println("Volume of cube: " + volume);
    }
}

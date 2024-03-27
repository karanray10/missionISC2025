package starPattern;

public class ReverseLeftHalfPyramid {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

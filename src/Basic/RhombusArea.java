package Basic;

import java.util.Scanner;

public class RhombusArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first diagonal of the rhombus: ");
        double diagonal1 = scanner.nextDouble();
        System.out.println("Enter the second diagonal of the rhombus: ");
        double diagonal2 = scanner.nextDouble();
        double area = (diagonal1 * diagonal2) / 2;
        System.out.println("The area of the rhombus is: " + area);
    }
}


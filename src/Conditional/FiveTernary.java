package Conditional;

public class FiveTernary {
    public static void main(String[] args) {
        int num1 = 15, num2 = 10, num3 = 45, num4 = 31, num5 = 25;
        int max = num1 > num2 ? (num1 > num3 ? num1 : (num3 > num4 ? num3 : num4)) : (num2 > num3 ? num2 : (num3 > num4 ? num3 : num4));

        int min = num1 < num2 ? (num1 < num3 ? num1 : (num3 < num4 ? num3 : num4)) : (num2 < num3 ? num2 : (num3 < num4 ? num3 : num4));

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}

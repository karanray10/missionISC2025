package Conditional;

public class DivideNumbers {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        if (num1 == 0 || num2 == 0) {
            System.out.println("Invalid entry. Cannot divide by zero.");
        } else {
            int largerNumber = Math.max(num1, num2);
            int smallerNumber = Math.min(num1, num2);
            double result = (double) largerNumber / smallerNumber;
            System.out.println("The result of dividing " + largerNumber + " by " + smallerNumber + " is: " + result);
        }
    }
}

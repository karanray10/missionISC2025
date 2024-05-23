package Reccursion;

 public class CountDigits {

    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        } else if (number < 0) {
            return countDigits(Math.abs(number));
        } else {
            return 1 + countDigits(number / 10);
        }
    }

    public static void main(String[] args) {
        int num = 12345;
        int digits = countDigits(num);
        System.out.println("Number of digits in " + num + ": " + digits);
    }
}


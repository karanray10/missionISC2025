package Reccursion;

public class Fibonacci {

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = fibonacci(number);
        System.out.println("The " + number + "th term of the Fibonacci series is: " + result);
    }
}

package Reccursion;

public class Product {

    static int product(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * product(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("The product of 5 using recursion is: " + product(5));
    }
}


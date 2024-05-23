package Reccursion;

public class Palindrome {

    static boolean isPalindrome(int n, int rev) {
        if (n == 0) {
            return n == rev;
        }
        rev = rev * 10 + n % 10;
        return isPalindrome(n / 10, rev);
    }

    public static void main(String[] args) {
        int number = 121;
        if (isPalindrome(number, 0)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}

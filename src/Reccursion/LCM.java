package Reccursion;
public class LCM {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 20;
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm(num1, num2));
    }
}

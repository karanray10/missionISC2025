package Reccursion;

public class DecToOct {

    static int convert(int n) {
        if (n == 0) {
            return 0;
        }

        return convert(n / 8) * 10 + (n % 8);
    }

    public static void main(String[] args) {
        int decimal = 136;
        int octal = convert(decimal);
        System.out.println(decimal + " in octal is " + octal);
    }
}



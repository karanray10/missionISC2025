package Reccursion;

class DecToBin {

    static int convert(int n) {
        if (n == 0) {
            return 0;
        }

        return (convert(n / 2) * 10) + (n % 2);
    }

    public static void main(String[] args) {
        int decimal = 1010;
        int binary = convert(decimal);
        System.out.println(decimal + " in binary is " + binary);
    }
}

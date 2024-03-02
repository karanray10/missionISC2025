package Conditional;

class Odddays {
    static int oddDays(int N)
    {
        int hund1 = N / 100;
        int hund4 = N / 400;

        int leap = N >> 2;
        int ord = N - leap;
        if (hund1 > 0) {
            ord += hund1;
            leap -= hund1;
        }
        if (hund4 > 0) {
            ord -= hund4;
            leap += hund4;
        }
        int days = ord + leap * 2;
        int odd = days % 7;

        return odd;
    }

    public static void main(String args[])
    {
        int N = 100;
        System.out.print(oddDays(N));
    }
}

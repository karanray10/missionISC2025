package Loop;

public class TechNumber {
    static int countDigits(int n)
    {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    static boolean isTech(int n)
    {
        int count = countDigits(n);

        if (count % 2 != 0)
            return false;
        int half = count / 2;
        int first_half = n / (int)Math.pow(10, half);
        int second_half = n % (int)Math.pow(10, half);
        int sum = first_half + second_half;
        if ((sum * sum) == n)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        if (isTech(81))
            System.out.println("True");
        else
            System.out.println("False");

        if (isTech(2025))
            System.out.println("True");
        else
            System.out.println("False");

        if (isTech(1521))
            System.out.println("True");
        else
            System.out.println("False");
    }
}

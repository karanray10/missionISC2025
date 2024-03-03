package TernaryOperator;

public class MaximumOfFourNumber {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 4;
        int d = 1;

        int max = (a>b)?
                ((a>c)? ((a>d)?a:d):(c > d)?c : d):
                ((b > c)?(b > d ? b : d):(c > d ? c : d));

        System.out.println("Maximum number  : "+max);
    }
}

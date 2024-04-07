import java.util.*;
public class SmithNumber {
    static int SumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int prime(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0)
                sum += SumDigit(i);
            n /= i;
        }
        return sum;
    }
static boolean isSmith(int n){
    return SumDigit(n)==prime(n);
}

public static void main(String[] args) {

    int number=43;
    if (isSmith(number)){
        System.out.println(number+"Smith Number");
    }else{
        System.out.println(number+"Not Smith Number");
    }
}
}
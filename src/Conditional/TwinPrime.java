package Conditional;

import java.util.Scanner;

public class TwinPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range limit");
        int range = sc.nextInt();
        TwinPrime tp = new TwinPrime();
        for (int i = 2; i < range - 2; i++) {
            boolean prime = tp.isprime(i) && tp.isprime(i + 2);
            if (prime == true)
                System.out.println("(" + i + "," + "(i+2)" + ")");
        }
    }

    private boolean isprime(int num) {
        boolean prime=true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                  prime=false;
                return false;
            }

        }
         return true;
    }

}

package Conditional;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        long num=sc.nextLong();
        int i=1;
        while(i<=num/2)
        {
            if (num%i==0)
            {
                 sum+=i;
            }
            i++;
        }
        if (sum==num){
            System.out.println("Perfect");
        }
        else {
            System.out.println("Not");
        }
    }
}

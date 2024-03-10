package Conditional;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Input:");
        int leap=sc.nextInt();
        if ((leap%4==0&&leap%100!=0)||(leap%400==0))
        {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("NOt");
        }
    }
}

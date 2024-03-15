package Loop;

import java.util.*;

public class BigBiggerBiggest
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        double a= sc.nextInt();
        double b= sc.nextInt();
        double c= sc.nextInt();
        double min=Math.min(Math.min(a,b),c);
        double max=Math.max(Math.max(a,b),c);
        System.out.println("Smallest number : "+ min);
        if (a !=max && a!=min)
            System.out.println("secon smallest number : "+a);
        else if (b !=max && b!=min)
            System.out.println("secon smallest number : "+b);
        else if(c!=max && c!=min)
            System.out.println("secon smallest number : "+c);

        System.out.println("largest number : "+ max);


    }

}

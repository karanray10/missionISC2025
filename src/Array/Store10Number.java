package Array;

import java.util.Scanner;

public class Store10Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
//            System.out.println(arr[i]+" ");
        }
        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
            System.out.println(arr[i]+" ");
        }
    }
}

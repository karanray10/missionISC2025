package Array;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int l = arr.length;
        System.out.println("Enter the number to be search:");
        int n = sc.nextInt();
        int i=0;
        for (i = 0; i < l; i++) {
            if (arr[i] == n) {
                break;
            }
        }
        if (i == l) {
            System.out.println("Succesfull");
        } else {
            System.out.println("Not Found");
            System.out.println(n + "Index no." + l);
        }
    }
}

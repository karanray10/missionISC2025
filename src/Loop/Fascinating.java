package Loop;

import java.util.Scanner;

class Fascinating {
    public static void main(String[] args) {
        int num, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        num = sc.nextInt();
        n2 = num * 2;
        n3 = num * 3;
        String concatStr = num + "" + n2 + n3;
        boolean found = true;

        for (char c = '1'; c <= '9'; c++) {
            int count = 0;
            for (int i = 0; i < concatStr.length(); i++) {
                char ch = concatStr.charAt(i);
                if (ch == c)
                    count++;
            }
            if (count > 1 || count == 0) {
                found = false;
                break;
            }
        }

        if (found) {
            System.out.println("It's a fascinating number!");
        } else {
            System.out.println("Not a fascinating number.");
        }
    }
}

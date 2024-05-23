package Reccursion;

public class Armstrong {

    static int sumOfCubes(int n) {
        if (n == 0) {
            return 0;
        }
        return (int) Math.pow(n % 10, 3) + sumOfCubes(n / 10);
    }

    static boolean isArmstrong(int num) {
        int original = num;
        int sum = sumOfCubes(num);
        return sum == original;
    }

    public static void main(String[] args) {
        int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}


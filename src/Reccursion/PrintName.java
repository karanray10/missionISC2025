package Reccursion;

public class PrintName {
static int count=0;
    public static void printName() {
        count++;
        if (count <=10) {
            System.out.println("Karan Ray");
            printName();
        }
    }

    public static void main(String[] args) {
        printName();
    }
}

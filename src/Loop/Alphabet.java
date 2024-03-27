package Loop;

public class Alphabet {
    public static void main(String[] args) {
        int i,j;
        Character c='A';
        for ( i = 5; i >= 1; i--) {
            for ( j = 1; j <= i; j++) {
                System.out.print(c+ " ");
               c++;
            }
            System.out.println();
        }
    }
}

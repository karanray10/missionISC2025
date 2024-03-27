package Loop;
public class E {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 1||i == 1||i == 5 || i == 5 / 2 + 1) {
                    System.out.print("E ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
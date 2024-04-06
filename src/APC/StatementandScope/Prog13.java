package APC.StatementandScope;

class Prog13
{
    static boolean checkPronic(int x)
    {
        for (int i = 0; i <= (int)(Math.sqrt(x)); i++)
            if (x == i * (i + 1))
                return true;

        return false;
    }

    // Driver Code
    public static void main(String[] args)
    {
        for (int i = 0; i <= 200; i++)
            if (checkPronic(i))
                System.out.print(i + " ");
    }
}

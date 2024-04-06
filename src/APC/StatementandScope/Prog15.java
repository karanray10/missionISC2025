package APC.StatementandScope;

class Prog15 {

    static boolean isPrime(int n)
    {
        // Corner cases
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
    static boolean twinPrime(int n1, int n2)
    {
        return (isPrime(n1) && isPrime(n2) &&
                Math.abs(n1 - n2) == 2);
    }

    public static void main(String[] args)
    {
        int n1 = 11, n2 = 13;

        if (twinPrime(n1, n2))
            System.out.println("Twin Prime");
        else
            System.out.println("Not Twin Prime");
    }
}

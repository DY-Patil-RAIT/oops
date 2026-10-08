public class Exp_2 {
    private static boolean isPrime(int n, int divisor) {
        if (divisor * divisor > n)
            return true;
        if (n % divisor == 0)
            return false;
        return isPrime(n, divisor + 1);
    }
    private static void printPrimes(int current, int limit) {
        if (current > limit)
            return;
        if (isPrime(current, 2))
            System.out.print(current + " ");
        printPrimes(current + 1, limit);
    }
    public static void main(String[] args) {

        printPrimes(2, 1000);
    }
}
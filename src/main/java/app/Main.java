package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("check whether 7 isprime: " );
        boolean res = isPrime(7);
        System.out.println("check result: " +res );
    }


    private static boolean isPrime(final int n) {
        System.out.println("call isPrime function");
        for (int i = 2; i * i <= n; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
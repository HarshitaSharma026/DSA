package Maths;

public class PrintAllPrimeNumbers {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        printPrime1(primes, n);
    }

    static void printPrime1(boolean[] primes, int n) {
        for (int i = 2; i * i <= n ; i++) {
            if (!primes[i]){
                // means it is a prime number as
                // false represents its a prime number
                // so now we'll make all its multiple true
                for (int j = i * 2; j <= n ; j+=i) {
                    primes[j] = true;
                }
            }
        }

        // printing the primes
        for (int i = 2; i <= n ; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

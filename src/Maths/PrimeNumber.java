package Maths;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 15;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": " + prime2(i));
        }
    }

    // find if a number is prime number of not
    // brute force
    static boolean prime1(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // find if a number is prime number or not
    // check upto square root of n
    // O(sqrt(n))
    static boolean prime2(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}

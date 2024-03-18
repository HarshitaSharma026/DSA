package Recurrsion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
//        reverse(n);
//        reverse2(n);
//        System.out.println( );
//        System.out.println(sum);
        System.out.println(reverse3(n));
    }

    static void reverse(int n) {
        if (n == 0) {
            return;
        }
        if (n < 0) {
            n = -n;
        }
        System.out.print(n % 10);
        reverse(n / 10);
    }

    // APPROACH 2
    static int sum = 0;
    static void reverse2(int n) {
        if (n <= 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse2(n / 10);
    }

    // APPROACH 3
    static int reverse3(int n) {
        // in this case when i need to pass an extra argument in the function call
        // in this always use a helper function, don't change the original function
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits - 1);
    }

    // APPROACH 3 - HELPER FUNCTION
    private static int helper(int n, int len) {
        if (n % 10 == n) {
            // means single digit is left
            // return to digit as it as nothing to be donw with it
            return n;
        }

        int rem = n % 10;
        return rem * (int) (Math.pow(10, len)) + helper(n / 10,--len);
    }
}

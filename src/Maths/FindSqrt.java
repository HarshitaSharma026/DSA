package Maths;

public class FindSqrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;    // means i want answer upto 3 decimal places
//        System.out.printf("%.3f", sqrt1(n, p));
//        System.out.println( );
//        System.out.println(sqrt2(n));
        System.out.println(Math.sqrt(2147395600));
    }

    // ---------------------------------- O(log n) complexity (if i want in decimal notation)
    static double sqrt1(int n, int p) {
        int s = 0;
        int e = n;
        while (s <= e) {
            int m = s + (e-s)/2;
            if (m * m == n) {
                return m;
            }

            if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        // means integer is not the root, root is a decimal number
        double incr = 0.1;
        double root = 0.0;

        // this loop is for upto how many decimal places do i need to check
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            // it came out
            // of the loop beacuse the root gets bigger from n,
            // so we need to subtract by 1 to get the root
            root -= incr;
            // increase the increment upto next decimal place
            incr /= 10;
        }
        return root;
    }

    // Newton raphson method
    static double sqrt2(double n) {
        double x = n;
        double root;

        while (true) {
            root = 0.5 * (x + (n/x));
            if (Math.abs(root - x) < 1) {
                break;
            }
            x = root;
        }
        return root;
    }

//    ----------------------- ANOTHER DIRECT METHOD TO GET SQRT OF A NUMBER ROUND TO NEAREST INTEGER
    static int sqrt3(int n) {
        int start = 1;
        int end = n;
        int result = 0;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid <= n) {
                result = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return result;
    }

}

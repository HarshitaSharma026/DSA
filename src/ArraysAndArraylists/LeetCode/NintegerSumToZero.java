package ArraysAndArraylists.LeetCode;

// APPROACH
// if n is odd : in one of the places in array, we'll add 0, and for rest of the places we'll add, i and -i
// if n is even: we'll keep adding i and -i till the loop ends

import java.util.Arrays;

public class NintegerSumToZero {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(Arrays.toString(findSum(n)));
    }

    static int[] findSum(int n) {
        int[] ans = new int[n];

        // if n is even
        if (n % 2 == 0) {
            for (int i = 0; i < n; i+=2) {
                ans[i] = i+1;
                ans[i+1] = -(i+1);
            }
        }
        else {
            for (int i = 0; i < n - 1; i+=2) {
                ans[i] = i+1;
                ans[i+1] = -(i+1);
            }
            ans[n - 1] = 0;
        }
        return ans;
    }
}

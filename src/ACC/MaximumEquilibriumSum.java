package ACC;

import java.util.stream.IntStream;

public class MaximumEquilibriumSum {

    static int maxSum(int[] arr) {
//        int sum = IntStream.of(arr).sum();
//        int pref = 0, max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            pref += arr[i];
//            if (pref == sum)
//                max = Math.max(max, pref);
//            sum -= arr[i];
//        }
//        return max;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int pref = arr[i];
            for (int j = 0; j < i; j++) {
                pref += arr[j];
            }
            int suffix = arr[i];
            for (int j = arr.length - 1; j > i; j--) {
                suffix += arr[j];
            }
            if (pref == suffix) {
                max = Math.max(max, pref);
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int[] arr = {-2, 5, 3, 1, 2, 6, -4, 2};
        System.out.println(maxSum(arr));
        String str = "HARSHITA";
        System.out.println(str.toLowerCase());
    }
}

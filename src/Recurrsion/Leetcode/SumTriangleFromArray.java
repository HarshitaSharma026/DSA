package Recurrsion.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printSum(arr);
    }

    static void printSum(int[] arr) {
        if (arr.length == 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        int[] ans = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            ans[i] = arr[i] + arr[i+1];
        }
        printSum(ans);
        System.out.println(Arrays.toString(arr));
    }
}

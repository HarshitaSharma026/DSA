package ACC;

import java.util.Arrays;

public class BlockAlgorithm {

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotate(int[] arr, int k) {
        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80,90};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}

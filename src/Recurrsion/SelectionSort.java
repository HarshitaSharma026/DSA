package Recurrsion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {- 4,-1};
        selection(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr, int pass, int ind, int max) {
        if (pass == 0) {
            return;
        }

        if (ind <= pass) {
            if (arr[ind] > arr[max]) {
                max = ind;
            }
            selection(arr, pass, ind + 1, max);
        }
        else {
            // swap max and element at pass
            int temp = arr[pass];
            arr[pass] = arr[max];
            arr[max] = temp;
            selection(arr, pass - 1, 0, 0);
        }
    }
}

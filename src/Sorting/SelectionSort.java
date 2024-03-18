package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {0,-1};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sorting(int[] arr) {
        int len = arr.length;
        int index = 0;

        for (int i = 0; i < len; i++) {
            int max = 0;
            for (int j = 0; j <= len - i - 1; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            // put max to its correct position
            int temp = arr[len - i - 1];
            arr[len - i - 1] = arr[max];
            arr[max] = temp;
        }
    }
}

package Sorting;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            // swap
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[max];
            arr[max] = temp;
        }
    }
}

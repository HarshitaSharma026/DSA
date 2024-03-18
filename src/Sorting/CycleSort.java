package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sorting(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int index = arr[i] - 1;
            if (arr[i] != arr[index]) {
                // swap
                swap(i, index, arr);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int ind1, int ind2, int[] arr) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}

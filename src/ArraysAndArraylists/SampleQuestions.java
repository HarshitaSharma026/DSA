package ArraysAndArraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class SampleQuestions {
    public static void main(String[] args) {
        int arr[] = {100, 12, 50, 14, 6,9, 78, 45, 3, 1, 99, 24, 92};
        max1DArray(arr, 1, 5);
        swap(arr, 0, 5);
        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println("after reverse arrays: " + Arrays.toString(arr));
    }

    static void max1DArray(int[] arr, int start, int end) {
        int max = 0;
        for(int i = start; i <= end; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Max element: " + max);
    }

    static void swap(int arr[], int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}

package Recurrsion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        bubble(arr.length - 1, 0, arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int pass, int ind, int[] arr) {
        if (pass == 0) {
            return;
        }

        if (ind < pass) {
            if (arr[ind] > arr[ind + 1]) {
                // swap
                int temp = arr[ind];
                arr[ind] = arr[ind + 1];
                arr[ind + 1] = temp;
                bubble(pass, ind + 1, arr);
            }
            else {
                bubble(pass, ind + 1, arr);
            }
        }
        else {
            bubble(pass - 1, 0, arr);
        }
    }
}

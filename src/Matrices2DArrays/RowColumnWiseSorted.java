package Matrices2DArrays;

import java.util.Arrays;

public class RowColumnWiseSorted {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}};
        System.out.println(Arrays.toString(search(arr, 100)));
    }

    static int[] search(int[][] arr, int target) {
        int lb = 0;
        int ub = arr.length - 1;

        while (lb < arr.length && ub >= 0) {
            if (target > arr[lb][ub]) {
                lb++;
            }
            else if (target < arr[lb][ub]) {
                ub--;
            }
            else if (target == arr[lb][ub]){
                return new int[]{lb, ub};
            }
        }
        return new int[]{-1,-1};
    }
}

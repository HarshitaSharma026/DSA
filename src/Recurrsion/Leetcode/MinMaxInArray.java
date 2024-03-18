package Recurrsion.Leetcode;

// https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
// finding minimum and maximum values in an array using recursion

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {11, 4, 3, -5, -14, 8, 6};
        minmax(arr, 0, arr[0], arr[0]);
    }

    static void minmax(int[] arr, int index, int min, int max) {
        if (index == arr.length) {
            System.out.println("Minimum value: " + min);
            System.out.println("Maximum values: " + max);
            return;
        }

        if (arr[index] > max) {
            max = arr[index];
        }
        if (arr[index] < min) {
            min = arr[index];
        }
        minmax(arr, index + 1, min, max);
    }
}

package Recurrsion;

public class BinarySearch {
    public static void main(String[] args) {

    }

    static int bs(int start, int end, int[] arr, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start)/2;
        if (arr[mid] == target) {
            return mid;
        }
        else if (arr[mid] > target) {
            return bs(start, mid - 1, arr, target);
        }
        else {
            return bs(mid + 1, end, arr, target);
        }
    }
}

package Recurrsion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(bs(arr, 4, 0, arr.length - 1));
    }

    static int bs(int[] arr, int target, int start, int end) {
        // base condition
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start)/2;
        // case 1
        if (target == arr[mid]){
            return mid;
        }

        // case 2
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target < arr[mid]) {
                return bs(arr, target, start, mid - 1);
            }
            else {
                return bs(arr, target, mid + 1, end);
            }
        }

        // case 3
        if (target > arr[mid] && target <= arr[end]) {
            return bs(arr, target, mid + 1, end);
        }
        else {
            return bs(arr, target, start, mid - 1);
        }

    }
}

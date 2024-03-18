package ArraysAndArraylists.BinarySearch;

public class RotationCountRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {18,20, 2,3,6,11,12,15};
        System.out.println("Count: " + findCount(arr));
    }

    // 1. Algo used: BS, why? b/c sorted array
    // 2. Rotated sorted array -> means pivot
    // 3. Find pivot
    //      -- if pivot == -1, means no rotation happenend
    //      -- else rotation_count = pivot_index + 1
    static int findCount(int[] arr) {
        int pivot = findPivot(arr);

        if (pivot == -1) {
            return 0;        // we can hide this one also, beacuse if pivot it -1
        }                   // -1 + 1 = 0 (count)
        else {
            return pivot+1;
        }
    }

    // find pivot
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // case where pivot is found
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // other cases
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

package ArraysAndArraylists.BinarySearch;

// Search in rotated sorted array: DISTINCT ELEMENTS

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
//        int[] arr = {2,3,4,10, 15, 17};
        System.out.println("index: " + findNumber(arr, 3));
    }

    // 1. Find pivot in the mountain array
    // 2. Apply binary search in one part of ascending array (0, pivot)
    // 3. If not found in first part, apply binary search in ascending part of mountain array (pivot + 1, n)

    static int findNumber(int[] arr, int target) {
        int pivot = findPivot(arr);

        // if you did not find pivot, it means array is not rotated
        if (pivot == -1)
            // do the normal binary search
            return bs(arr, target, 0, arr.length - 1);

        // if pivot == target
        if (arr[pivot] == target)
            return pivot;

        // if target > start, no need to search in 2nd half of the array,
        // as all the element after pivot will be smaller than the target
        if (target >= arr[0]) {
            return bs(arr, target, 0, pivot - 1);
        }

        // if target < start, no need to search in 1st half of the array
        // the smaller elements will always lie after the pivot
        return bs(arr, target, pivot + 1, arr.length - 1);
    }

    // for finding pivot
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // case when we are getting the pivot at mid
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            // another case of getting the pivot
            else if (mid > start && arr[mid] < arr[mid - 1])
                return (mid - 1);
            // if the start is smaller than mid, means we are ascending part, we need to move further after mid to get the pivot
            else if (arr[start] < arr[mid])
                start = mid + 1;
            // if the start > mid, means after mid all the elements will be smaller, so move before mid
            else if (arr[start] >= arr[mid])
                end = mid - 1;
        }
        return -1;
    }

    // binary search within the given range
    static int bs(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

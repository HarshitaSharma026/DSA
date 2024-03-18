package ArraysAndArraylists.BinarySearch;

public class SearchRotatedSortedArrayDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {12,9,12,2,12};
        System.out.println("index: " + findNumber(arr, 2));
    }

    // 1. Find pivot in the mountain array
    // 2. Apply binary search in one part of ascending array (0, pivot)
    // 3. If not found in first part, apply binary search in ascending part of mountain array (pivot + 1, n)

    static int findNumber(int[] arr, int target) {
        int pivot = findPivotWithDuplicates(arr);

        // if you did not find pivot, it means array is not rotated
        if (pivot == -1)
            // do the normal binary search
            return bs(arr, target, 0, arr.length - 1);

        // if pivot == target
        if (pivot == target)
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
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // case when we are getting the pivot at mid
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
                // another case of getting the pivot
            if (mid > start && arr[mid] < arr[mid - 1])
                return (mid - 1);

            // if elements at middle, start, and end are equal then
            // just skip the duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??

                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check if end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid]) && arr[mid] < arr[end]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
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

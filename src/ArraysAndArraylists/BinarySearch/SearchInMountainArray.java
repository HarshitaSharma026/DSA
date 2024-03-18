package ArraysAndArraylists.BinarySearch;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        System.out.println(findElement(arr, 23));
    }

    // 1. find the peak element
    // 2. find the target in ascending part of array
    // 3. if not found in ascending, find the target in descending part of the array
    // order - agnostic bs


    // the main method which is calling other methods
    static int findElement(int[] arr, int target) {
        int peak = peakElement(arr);
        int first = bsAscending(arr, target, 0, peak);
        if (first == -1) {
            // search in descending part as its not found in ascending part
            return bsDescending(arr, target, peak + 1, arr.length - 1);
        }
        else {
            return first;
        }
    }
    // finding peak element
    static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // we are in ascending part of the array, peak element will lie on rhs
                start = mid + 1;
            }
            else if (arr[mid] > arr[mid + 1]) {
                // we are in descending part of the array, this could be the element
                // but its also possible that the peak element will lie on lhs
                // but if this element is also greater than its previous element, means we have found our answer
                if (arr[mid] > arr[mid - 1]) {
                    return mid;
                } else {
                    end = mid;
                }
            }
        }
        return -1;
    }

    // search in ascending part
    static int bsAscending(int[] arr, int target, int start, int end) {
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

    // search in descending part
    static int bsDescending(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > target) {
                start = mid + 1;
            } else if (arr[mid] < target) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

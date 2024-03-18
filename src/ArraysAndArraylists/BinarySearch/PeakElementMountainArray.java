package ArraysAndArraylists.BinarySearch;

public class PeakElementMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};
        System.out.println("Peak index: " + peakElement(arr));
    }

    static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] < arr[mid + 1]) {
                // ascending part of the array, peak element will lie on rhs
                start = mid + 1;
            }
            else if (arr[mid] > arr[mid + 1]) {
                // descending part of the array, this mid could be a possible answer
                // but look at lhs to find if there is another element exists
                if (arr[mid] > arr[mid - 1]) {
                    // we have found our answer
                    return mid;
                }
                else {
                    end = mid;
                }
            }
        }

        return -1;
    }
}

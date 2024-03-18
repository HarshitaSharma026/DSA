package ArraysAndArraylists.BinarySearch;

public class BinarySearching {
    public static void main(String[] args) {
        int arr[] = {12, 33, 55, 67, 88,90};
        System.out.println(bs(arr, -1));
    }

    static int bs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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

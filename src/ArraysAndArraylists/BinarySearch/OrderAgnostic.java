package ArraysAndArraylists.BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        int arr[] = {12, 33, 55, 67, 88,90};
        int a[] = {90, 88, 67, 55, 33, 12};
        System.out.println(bs(arr, 90));
        System.out.println(bs(a, 90));
    }

    static int bs(int[] arr, int target) {
        if (arr[0] <  arr[arr.length - 1])
            return ascending_bs(arr, target);
        else if (arr[0]> arr[arr.length - 1])
            return descending_bs(arr, target);
        else
            return -1;
    }


    // --------- for ascending order array
    static int ascending_bs(int[] arr, int target) {
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


    // -------- for descending order array
    static int descending_bs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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

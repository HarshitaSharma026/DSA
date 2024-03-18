package ArraysAndArraylists.BinarySearch;

public class FloorCeiling {
    public static void main(String[] args) {
        int[] arr = {2,3,9,15,23,25,30,40};
        System.out.println("ceiling: " + ceiling(arr, 50));
        System.out.println("floor: " + floor(arr, 1));
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[arr.length - 1])
            return -1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[start];
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target < arr[0])
            return -1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}

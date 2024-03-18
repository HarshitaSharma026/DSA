package ArraysAndArraylists.BinarySearch;

public class PosElementInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {3,5,7,9,10,90,100,130,140,160,170};
        System.out.println("Index: " + finalAns(nums, 130));
    }

    // finding that chunk in which we need to search
    static int finalAns(int[] nums, int target) {
        int start = 0;
        int end = nums[1];

        while (target > nums[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = end;
        }
        int index = bs(nums, start, end, target);
        return index;
    }

    // actual binary search operation on the chunk
    static int bs(int[] arr, int start, int end, int target) {

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

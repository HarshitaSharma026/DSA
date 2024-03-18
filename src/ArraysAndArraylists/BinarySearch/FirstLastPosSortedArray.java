package ArraysAndArraylists.BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstLastPosSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};
//        int[] nums = {};
        System.out.println("Index: " + Arrays.toString(searchRange(nums, 0)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int firstIndex = searchIndex(nums, target, true);
        int lastIndex = searchIndex(nums, target, false);
        ans[0] = firstIndex;
        ans[1] = lastIndex;
        return ans;
    }

    static int searchIndex(int[] nums, int target, boolean firstIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (nums[mid] > target) {
                end = mid - 1;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                ans = mid;
                // we have found the potential answer
                // if we are looking for first index, then we'll search further on left hand side
                if (firstIndex) {
                    end = mid - 1;
                }
                else {
                    // if we are looking for last index, then we'll search further on right hand side
                    start = mid + 1;
                }
            }
        }
        return ans;
    }


}

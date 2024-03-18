package Sorting.Leetcode;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int[] nums) {
        int count = 1;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) {
                count += 1;
            } else {
                if(count > (nums.length / 2)) {
                    return nums[i];
                }
                count = 1; // Reset count for the next element
            }
        }

        // Check the last element
        if(count > (nums.length / 2)) {
            return nums[nums.length - 1];
        }

        return -1;
    }
}

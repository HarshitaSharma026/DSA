package ArraysAndArraylists.LeetCode;


// APPROACH
// uisng one pass hash table :
// find difference between the value at current index and the target
// if the difference exists in the hash table, then print its index, otherwise add the number at that index and its index value
// to the hash table

// two pass hash table method:
// we traverse through array, store each element and its index in the hash table
// then check if the difference exists in the hash table
// problem with this one: arr[] = {2,3,2,5}, target = 4, in this case, 4 -2 = 2, it'll find 2 at first index only
// and it'll result in ans = [0,0], where actual ans is = [0,2]

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(find(arr, 23)));
    }

    static int[] find(int[] arr, int target) {
        int[] ans = {-1,-1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                ans[0] = map.get(diff);
                ans[1] = i;
                return ans;
            }
            map.put(arr[i], i);
        }
        return ans;
    }
}

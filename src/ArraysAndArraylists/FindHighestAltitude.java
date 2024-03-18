package ArraysAndArraylists;

import java.util.Arrays;

public class FindHighestAltitude {
    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }

    static int largestAltitude(int[] gain) {
        int count = 1;
        int[] ans = new int[gain.length + 1];
        ans[0] = 0;

        // loop for creating the gain at each point array
        for(int i = 0; i < gain.length; i++) {
            ans[count] = ans[i] + gain[i];
            count++;
        }

        System.out.println("new array: " + Arrays.toString(ans));
        // finding the max altitude
        int max = 0;
        for(int i = 0; i < ans.length; i++) {
            if(ans[i] > max) {
                max = ans[i];
            }
        }
        return max;
    }
}

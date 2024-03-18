package ArraysAndArraylists;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 22, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        System.out.println(Arrays.toString(search(arr, 12)));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target)
                    return new int[]{row, col};
            }
        }
        return new int[]{-1,-1};
    }
}

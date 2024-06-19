package ACC;

public class MaxProductSubarray {

    static int maxProduct(int[] arr) {
        int pref = 1, suffix = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            pref = pref * arr[i];
            suffix = suffix * arr[arr.length - i - 1];
            if (pref == 0)
                pref = 1;
            if (suffix == 0)
                suffix = 1;
            max = Math.max(max, Math.max(pref, suffix));
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        System.out.println(maxProduct(arr));
    }
}

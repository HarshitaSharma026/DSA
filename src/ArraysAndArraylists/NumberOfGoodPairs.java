package ArraysAndArraylists;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println("ans: " + numIdenticalPairs(nums));
    }

    static int numIdenticalPairs(int[] nums) {
        int[] ans = new int[5];

        // counting each value
        for(int elem: nums) {
            ans[elem]++;
        }
//        for (int elem: ans) {
//            System.out.print(elem + " ");
//        }

        // calculating the count
        int pair = 0;
        for(int i = 0; i < ans.length; i++) {
            if (ans[i] > 1) {
                pair += (ans[i] * (ans[i] - 1)) / 2;
                System.out.println("pair: " + pair);
            }
        }
        return pair;
    }
}

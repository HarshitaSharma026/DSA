package CompanyQuestions;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(sliding(arr));;
    }

    static int sliding(int[] arr) {
        int csum = 0, maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            csum += arr[i];
        }
        maxsum = csum;
        for (int i = 3; i < arr.length; i++) {
            csum = csum - arr[arr.length - i -1] + arr[i];
            maxsum = Math.max(csum, maxsum);
        }

        return maxsum;
    }
}

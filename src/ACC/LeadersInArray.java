package ACC;

public class LeadersInArray {

    static void printLeaders(int[] arr) {
        int last = arr[arr.length - 1];
        System.out.println(last);
        int max = last;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.println(max);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 1, 9, 3,2,8,6,7};
        printLeaders(arr);
    }
}

package ArraysAndArraylists;

class EvenNumberOfDigits {
    public static void main(String[] args) {
        int num = 6788;
        System.out.println((int)(Math.log10(num) + 1));
    }

//    public int findNumbers(int[] nums) {
//        int count = 0;
//        for(int i = 0; i < nums.length; i++) {
//            if (Math.log10(nums[i] + 1) % 2 == 0) {
//                count++;
//            }
//        }
//        return count;
//    }
}
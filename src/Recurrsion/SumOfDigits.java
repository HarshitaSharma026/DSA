package Recurrsion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 4567;
        System.out.println(sumDigits(n));
    }

    static int sumDigits(int num) {
        if (num <= 0) {
            return 0;
        }
        int rem = num % 10;
        return rem + sumDigits(num / 10);
    }
}

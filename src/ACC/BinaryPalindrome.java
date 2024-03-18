package ACC;

public class BinaryPalindrome {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(binaryPalindrome(num));
    }

    static boolean binaryPalindrome(int x) {
        int rev = 0;
        int org = x;
        while (org != 0) {
            rev <<=1;
            rev |= (org&1);
            org>>=1;
        }
        return rev == x;
    }
}

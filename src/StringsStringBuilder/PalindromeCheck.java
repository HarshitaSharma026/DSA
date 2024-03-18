package StringsStringBuilder;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = null;
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        int start = 0;
        int end = str.length() - 1;
        while (start != end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;

    }
}

package ArraysAndArraylists;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Harshita";
        System.out.println(search(name, 'x'));
        System.out.println(search2(name, 't'));
        System.out.println(search3(name, 's', 2,6));
    }

    // search for a character in a string
    static boolean search(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }

        return false;
    }

    // use of for each loop using - toCharArray()
    static boolean search2(String str, char ch) {
        for(char elem : str.toCharArray()) {
            if (elem == ch)
                return true;
        }

        return false;
    }

    // search in the range
    static boolean search3(String str, char ch, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }

        return false;
    }
}

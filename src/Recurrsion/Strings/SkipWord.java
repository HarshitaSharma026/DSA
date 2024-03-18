package Recurrsion.Strings;

public class SkipWord {
    public static void main(String[] args) {
        String str = "I eat apple app everyday now";
        System.out.println(skipWord(str, "apple"));
        System.out.println(skipWordAppNotApple(str));
    }

    // skip the word
    static String skipWord(String str, String skip) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith(skip)) {
            return skipWord(str.substring(skip.length()), skip);
        }
        else {
            return str.charAt(0)+ skipWord(str.substring(1), skip);
        }
    }

    // skip the word that start with app and not apple
    static String skipWordAppNotApple(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipWordAppNotApple(str.substring(3));
        }
        else {
            return str.charAt(0)+ skipWordAppNotApple(str.substring(1));
        }
    }
}

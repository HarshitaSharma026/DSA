package StringsStringBuilder;

import java.util.HashMap;
import java.util.Map;

public class EvenFrequencySum {
    public static void main(String[] args) {
        String str = "aaabbaccccdd";
        System.out.println(countEvenFrequency(str));
    }

//    static void countEvenFrequency(String str) {
//        HashMap<Character, Integer> map = new HashMap<>();
////        map.put('a', 3);
//        for (int i = 0; i < str.length(); i++) {
//            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
//        }
//        // loop through the map
//        for(Map.Entry<Character, Integer> elem: map.entrySet()) {
//            System.out.println("Key: " + elem.getKey() + ", Value: " + elem.getValue());
//        }
//    }

    static int countEvenFrequency(String str) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count++;
            }
            else {
                if (count % 2 == 0) {
                    sum += count;
                }
            }
        }
        return sum;
    }
}

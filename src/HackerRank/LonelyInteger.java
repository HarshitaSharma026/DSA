package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(lonely(list));

    }

    static int lonely(List<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // counting occurance and storing it in map
        for(int i = 0; i < arr.size(); i++) {
            int key = arr.get(i);
            if (!map.containsKey(key)) {
                map.put(arr.get(i), 1);
            }
            else {
                int value = map.get(key);
                map.put(key, (++value));
            }
        }

        // counting in map
        for (Map.Entry<Integer, Integer> e: map.entrySet()) {
            if (e.getValue() == 1) {
                return e.getKey();
            }
        }
        return -1;
    }
}

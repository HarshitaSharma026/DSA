package ArraysAndArraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args) {

        // if we are creating ArrayList using List
        List<List<String>> items = new ArrayList<List<String>>();
        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("computer","silver","lenovo"));
        items.add(Arrays.asList("phone","gold","iphone"));
        System.out.println(countMatches(items, "type", "phone"));

        // if we are creating ArrayList using Arraylist
//        ArrayList<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>();
//        numbers.add(new ArrayList<>());
//        numbers.get(0).add(0,90);
//        numbers.get(1).add(1,78);
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        // search within each sublist of the list using 2 for loops
        for(int i = 0; i < items.size(); i++) {
            for(int j = 0; j < 3; j++) {
                if (ruleKey == "type" && items.get(i).get(j) == ruleValue) {
                    count++;
                }
                else if (ruleKey == "color" && items.get(i).get(j) == ruleValue) {
                    count++;
                }
                else if (ruleKey == "name" && items.get(i).get(j) == ruleValue) {
                    count++;
                }
            }
        }
        return count;
    }
}

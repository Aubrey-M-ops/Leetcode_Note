package java_practice;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // build key
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder key = new StringBuilder();
            for (int num : count) {
                key.append("#").append(num);
            }
            // add to map
            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());

    }

    public static void main(String[] args) {
        String[][] testcases = {
                { "eat", "tea", "tan", "ate", "nat", "bat" },
                { "" },
                { "a" }
        };
        for (String[] testcase : testcases) {
            System.out.println(
                    Arrays.toString(testcase) + ">>>>>>" + Arrays.deepToString(groupAnagrams(testcase).toArray()));
        }
    }
}

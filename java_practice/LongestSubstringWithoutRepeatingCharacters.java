package java_practice;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int LongestSubstring(String s){
        Map<Character, Integer> last = new HashMap<>();
        int left = 0, ans = 0;
        for(int right = 0; right < s.length(); right++){
            //move left
            char c = s.charAt(right);
            if(last.containsKey(c)){
                left = Math.max(left, last.get(c) + 1);
            }
            last.put(c, right);
            // get longest
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public void main() {
        String[] strs = {
            "abcabcbb",
            "bbbbb",
            "pwwkew"
        };
        for(String str: strs){
            System.out.println(str + ">>>>>>>>" + LongestSubstring(str));
        }
    }
    
}

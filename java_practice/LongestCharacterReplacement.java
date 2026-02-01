package java_practice;

import java.util.*;

public class LongestCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        // maxLen is the max freqency "of all time"!!!!(not just the current window)
        Map<Character, Integer> freq = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            // update freq
            freq.put(s.charAt(right), freq.getOrDefault(s.charAt(right), 0) + 1);
            // update the max freqeuncy
            maxLen = Math.max(maxLen, freq.get(s.charAt(right)));
            // whether shrink the window ?
            // if the max freqeuncy of a char is maxLen, the longest subString we can get is
            // maxLen+k
            // if current window (right - left + 1) is longer than that , shrink !!!
            if (right - left + 1 > maxLen + k) {
                // left goes right
                freq.put(s.charAt(left), freq.get(s.charAt(left)) - 1);
                left++;
            }
        }
        return s.length() - 1 - left + 1;
    }

    public static void main(String[] args) {
        String[] testcases = {
                "ABAB",
                "AABABBA",
                "A"
        };

        for(String testcase: testcases){
            System.out.println(testcase + ">>>>>" + characterReplacement(testcase, 1));
        }
    }

}

package com.william.leet;

import java.util.*;

/**
 * Longest Substring Without Repeating Characters
 * Given a string s, find the length of the longest substring without duplicate characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String s = "abc";
        int result = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }

    /**
     * My solution
     * Sliding Window + HashSet
     * 個人覺得是要想到  Math.max(maxLength, right - left);
     * abcabcbb
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {

        Set<Character> seen = new HashSet<>();
        int left = 0, right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            if (!seen.contains(c)) {
                seen.add(c);
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                seen.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;

    }

}

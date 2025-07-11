package com.william.top150.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();

        int left =0;
        int right = 0;
        int max = 0;

        while(right < s.length()){

            // 若有包含，表示重複
            if(map.containsKey(s.charAt(right))){
                map.remove(s.charAt(left));
                left++;
            }else {
                map.put(s.charAt(right), 1);
                right ++ ;
                max = Math.max(max, right-left);
            }

        }

        return max;
    }

    public int lengthOfLongestSubstring2(String s) {

        Set<Character> seen = new HashSet<>();

        int left = 0;
        int right = 0;
        int maxLength = 0;

        while(right < s.length()){
            char c = s.charAt(right);
            if(!seen.contains(c)){
                seen.add(c);
                right++;
                maxLength = Math.max(maxLength, right-left);
            }else{
                seen.remove(s.charAt(left));
                left++;
            }

        }

        return maxLength;
    }

}

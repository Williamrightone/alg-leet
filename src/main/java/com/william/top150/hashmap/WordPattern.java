package com.william.top150.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {

    public static void main(String[] args) {

    }

    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> map = new HashMap<>();
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {

            char c = pattern.charAt(i);
            String word = words[i];

            if(map.containsKey(c)){
                if (!map.get(c).equals(word)) return false;
            }else {
                if (seen.contains(word)) return false; // word 已被其他 pattern 映射過
                map.put(c, word);
                seen.add(word);
            }

        }

        return true;

    }

}

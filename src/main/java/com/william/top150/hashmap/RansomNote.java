package com.william.top150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {

    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> magazineMap = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if(!magazineMap.containsKey(c) || magazineMap.get(c)==0){
                return false;
            }

            magazineMap.put(c, magazineMap.get(c) - 1);

        }

        return true;
    }

    public static boolean canConstruct2(String ransomNote, String magazine) {

        int[] counts = new int[26];

        for (char c : magazine.toCharArray()) {
            counts[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (counts[c - 'a'] == 0) {
                return false;
            }
            counts[c - 'a']--;
        }

        return true;

    }

}

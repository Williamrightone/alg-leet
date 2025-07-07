package com.william.top150.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 *
 * Output: false
 */
public class ValidAnagram {

    public static void main(String[] args){

        System.out.println(isAnagramA("cat","car" ));
        System.out.println(isAnagramB("cat","car" ));

        char a = 'a';
        char z = 'z';
        String hello = "你好";
        System.out.println(a);
        System.out.println(z);
        System.out.println((int)a);
        System.out.println((int)z);
        System.out.println(100 - a);
        System.out.println(hello.charAt(0));
        System.out.println((int) hello.charAt(0));

//        int[] count = new int[26];
//        for (int c : count) {
//            System.out.println(c);
//        }

    }

    public static boolean isAnagramA(String s, String t) {

        if(s.length()!= t.length()){
            return false;
        }

        Map<Character, Integer> stringAMap = new HashMap<>();

        for(int i =0; i< s.length(); i ++){

            if(stringAMap.get(s.charAt(i)) == null){
                stringAMap.put(s.charAt(i), 1);
            }else {
                stringAMap.put(s.charAt(i), stringAMap.get(s.charAt(i)) +1);
            }

        }

        for(int i =0; i<t.length(); i++){
            if(stringAMap.containsKey(t.charAt(i))){

                if(stringAMap.get(t.charAt(i)) == 1){
                    stringAMap.remove(t.charAt(i));
                }else {
                    stringAMap.put(t.charAt(i), stringAMap.get(t.charAt(i)) -1);
                }

            }
        }

        return stringAMap.isEmpty();

    }

    public static boolean isAnagramB(String s, String t) {

        if(s.length()!= t.length()){
            return false;
        }

        int[] count = new int[26];

        for(int i =0; i<t.length(); i++){

            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;

        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }

}

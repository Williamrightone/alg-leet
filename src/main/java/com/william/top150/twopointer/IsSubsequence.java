package com.william.top150.twopointer;

import java.util.LinkedList;
import java.util.Queue;

public class IsSubsequence {

    public static void main(String[] args) {

        String s = "abc";

        String t = "ahbgdc";

        System.out.println(isSubsequence(s,t));

    }

    public static boolean isSubsequence(String s, String t) {

        Queue<Character> queue = new LinkedList<>();

        for (char c : s.toCharArray()) {
            queue.add(c);
        }

        for (char c : t.toCharArray()) {
            if (!queue.isEmpty() && c == queue.peek()) {
                queue.poll();
            }
        }

        return queue.isEmpty();

    }

    /**
     * two point
     * @param s
     * @param t
     * @return
     */
    public static boolean isSubsequence2(String s, String t) {

        int i =0, j =0;

        while(i < s.length() && j < t.length()){

            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        return i == s.length();
    }

}

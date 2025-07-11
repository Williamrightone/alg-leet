package com.william.top150.multidimensional;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String s = "cbbd";

        System.out.println(longestPalindrome(s));

    }

    public static String longestPalindrome(String s) {

        int max = 0;

        for(int i = 0; i< s.length(); i ++){

            // 中心點擴展法
            int left = i;
            int right = i;

            while(left < 0 || right > s.length()-1){

            }



        }


        return "";
    }

}

package com.william.top150.math;

public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println(isPalindrome(135431));

    }

    public static boolean isPalindrome(int x) {

        String paString = String.valueOf(x);

        int start = 0;
        int end = paString.length() -1;

        for(int i = 0; i< paString.length(); i++){

            if(paString.charAt(start) != paString.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

}

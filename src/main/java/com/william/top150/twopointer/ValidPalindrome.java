package com.william.top150.twopointer;

public class ValidPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("i"));
    }

    public static boolean isPalindrome(String s) {

        StringBuilder cleaned = new StringBuilder ();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                if(Character.isUpperCase(c)){
                    cleaned.append(Character.toLowerCase(c));
                }else{
                    cleaned.append(c);
                }
            }
        }

        int n = cleaned.length();

        int j = n-1;

        for(int i = 0; i<cleaned.length(); i++){

            if(cleaned.charAt(i) != cleaned.charAt(j)){
                return false;
            }

            j--;

        }


        return true;
    }

}

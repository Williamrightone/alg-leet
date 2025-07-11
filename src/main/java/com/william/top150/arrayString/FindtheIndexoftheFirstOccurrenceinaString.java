package com.william.top150.arrayString;

public class FindtheIndexoftheFirstOccurrenceinaString {

    public static void main(String[] args) {

        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("mississippi", "issip"));

        System.out.println(strStr2("sadbutsad", "sad"));
        System.out.println(strStr2("leetcode", "leeto"));
        System.out.println(strStr2("mississippi", "issip"));
    }

    /**
     *  O(n*m)
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {

        int needleIndex = 0;

        int index = -1;

        for(int i = 0; i< haystack.length(); i++ ){

            if(haystack.charAt(i) == needle.charAt(needleIndex)){

                needleIndex ++;

                if(index == -1){
                    index = i;
                }

                if(needleIndex == needle.length()){
                    return index;
                }

            }else {
                if (index != -1) {
                    i = index;
                }
                needleIndex = 0;
                index = -1;
            }

        }

        return -1;
    }

    /**
     * KMP
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr2(String haystack, String needle) {


        return -1;
    }



}

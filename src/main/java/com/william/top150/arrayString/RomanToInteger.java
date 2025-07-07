package com.william.top150.arrayString;

import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args){
        System.out.println(romanToInt("IV"));
    }


    public static int romanToInt(String s) {

        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        int result = 0;

        for(int i =0; i<s.length(); i ++){

            // 當前數值
            int value = map.get(s.charAt(i));

            if(i+1<s.length() && value< map.get(s.charAt(i+1))){
                result = result - value;
            }else {
                result = result + value;
            }

        }

        return result;
    }

}

package com.william.top150.bit;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class BitManipulation {

    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};

        int a = 5, b = 5;
        a = a ^ b;
        a = a ^ b;

        System.out.println(a);

        System.out.println(singleNumber(nums));
        System.out.println(singleNumber2(nums));
    }

    public static int singleNumber(int[] nums) {

        // use only constant extra space !!!!!
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++){

            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }else {
                map.put(nums[i],1);
            }

        }

        return map.keySet().iterator().next();
    }

    /**
     * int[] nums = {4,1,2,1,2};
     * @param nums
     * @return
     */
    public static int singleNumber2(int[] nums) {

        int result = 0;
        for(int i =0; i<nums.length; i++){

            result = result ^ nums[i];

        }

        return result;
    }

}

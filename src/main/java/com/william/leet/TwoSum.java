package com.william.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int target = 6;
        int[] result = twoSum2(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    /**
     * My solution [3,2,3]
     * 原先想法是使用兩層迴圈，第一層迴圈從0開始，第二層迴圈從i+1開始，這樣就可以避免重複計算同一個元素。
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {

          for(int i = 0; i< nums.length; i++){
              for(int j = i+1; j< nums.length; j++){
                  if(target == nums[i] + nums[j]){
                      return new int[]{i, j};
                  }
              }
          }

        return null;
    }

    /**
     * LeetCode solution -> optimized solution
     * 核心是 target - nums[i] = complement
     * 把自己走過的數字存到 Map 中，下一個數字去尋找能夠和 target 一致的數字是否存在過
     * 這樣只要循環最多一次
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}

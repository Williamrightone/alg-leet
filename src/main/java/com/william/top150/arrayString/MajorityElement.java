package com.william.top150.arrayString;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElement2(nums));
    }

    /**
     * 空間複雜度比較高
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }

        Map<Integer,Integer> map = new HashMap<>();

        int gate = nums.length / 2;

        for(int i = 0; i< nums.length; i++){

            if(map.containsKey(nums[i])){

                if(map.get(nums[i]) +1 > gate){
                    return nums[i];
                }

                map.put(nums[i], map.get(nums[i]) +1);
            }else {
                map.put(nums[i], 1);
            }

        }

        return 0;
    }

    /**
     * Boyer-Moore 投票演算法（Boyer-Moore Majority Vote Algorithm）
     * @param nums
     * @return
     */
    public static int majorityElement2(int[] nums) {

        int candidate = nums[0];
        int count = 0;



        for(int i = 0; i< nums.length; i++){

            if(count == 0){
                candidate = nums[i];
            }

            if(candidate == nums[i]){
                count++;
            }else {
                count--;
            }

        }

        return candidate;
    }


}

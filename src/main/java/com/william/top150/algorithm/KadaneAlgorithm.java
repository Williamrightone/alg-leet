package com.william.top150.algorithm;

public class KadaneAlgorithm {

    public static void main(String[] args) {

        int[] nums = {5,4,-1,7,8};

        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {

        int maxSoFar = nums[0];
        int maxEndingHere  = nums[0];

        for(int i = 1; i< nums.length; i++){

            maxSoFar = Math.max(nums[i], maxSoFar+nums[i]);
            maxEndingHere = Math.max(maxEndingHere, maxSoFar);

        }

        return maxEndingHere;
    }

}

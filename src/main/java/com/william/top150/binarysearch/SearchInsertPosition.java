package com.william.top150.binarysearch;

import java.util.Arrays;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};

        System.out.println(searchInsert(nums, 2));
        System.out.println(Arrays.toString(nums));

        System.out.println(searchInsert2(nums, 2));
        System.out.println(Arrays.toString(nums));
    }

    public static int searchInsert(int[] nums, int target) {

        for(int i = 0; i< nums.length;i++){

            if(nums[i] >= target){
                return i;
            }

        }

        return nums.length;
    }

    public static int searchInsert2(int[] nums, int target) {

        // 用二分法

        int mid = 0;
        int left = 0;
        int right = nums.length -1;

        while(left <= right){

            mid = left + (right - left )/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                left = mid +1;
            }else {
                right = mid -1;
            }

        }

        return left;

    }

}

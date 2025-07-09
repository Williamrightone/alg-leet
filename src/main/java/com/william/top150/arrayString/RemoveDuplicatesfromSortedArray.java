package com.william.top150.arrayString;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int init =0;

        for(int i = 1; i < nums.length; i ++){

            if(nums[init] != nums[i] ){
                init ++;
                nums[init] = nums[i];
            }

        }

        return init +1;
    }

}

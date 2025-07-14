package com.william.top150.Intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {


    }

    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;

        int start = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                // 當前與前一個不連續，結束這一段區間
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i - 1]);
                }
                start = nums[i]; // 開啟下一段區間
            }
        }

        // 處理最後一段
        if (start == nums[nums.length - 1]) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + nums[nums.length - 1]);
        }

        return result;
    }

}

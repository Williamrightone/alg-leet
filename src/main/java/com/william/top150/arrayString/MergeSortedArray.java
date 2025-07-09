package com.william.top150.arrayString;

import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println("Merged nums1: " + Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;           // 指向 nums1 有效區間最後一個元素
        int p2 = n - 1;           // 指向 nums2 最後一個元素
        int p = m + n - 1;        // 從 nums1 最後一格開始填入

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
//                nums1[p--] = nums1[p1--];
                nums1[p] = nums1[p1];
                p--;
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p--;
                p2--;
            }
        }

        // 如果 nums2 還有剩，補進 nums1（nums1 剩下的就已經在對的位置）
        while (p2 >= 0) {
            nums1[p--] = nums2[p2--];
        }
    }

}

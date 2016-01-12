package com.kolamomo.leetcode;

import java.util.Arrays;

/**
 * Merge Sorted Array
 *
 * <p>Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.<br>
 *
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 *
 * @author jay
 */
public class Ex88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) {
            return;
        }
        int index = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[index--] = nums1[i--];
            } else {
                nums1[index--] = nums2[j--];
            }
        }

        while(i >= 0) {
            nums1[index--] = nums1[i--];
        }

        while(j >= 0) {
            nums1[index--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        Ex88 ex88 = new Ex88();
        int[] nums1 = new int[]{1, 4,6, 7, 8, 0, 0, 0};
        int[] nums2 = new int[]{3,5,9};
        ex88.merge(nums1, 5, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}

package com.kolamomo.leetcode;

/**
 * Search in Rotated Sorted Array
 *
 * <p>Suppose a sorted array is rotated at some pivot unknown to you beforehand. <br>
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).<br>
 * You are given a target value to search. If found in the array return its index, otherwise return -1.<br>
 * You may assume no duplicate exists in the array. <br>
 *
 *      @author jay
 */
public class Ex33 {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }

    private int binarySearch(int []nums, int start, int end, int target) {
        if(start > end) {
            return -1;
        } else {
            int result = -1;

            int mid = (start + end) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                if(nums[start] > nums[mid]) {
                    result = binarySearch(nums, start, mid - 1, target);
                }
                if(result == -1) {
                    result = binarySearch(nums, mid+1, end, target);
                }
            } else {
                if(nums[end] < nums[mid]) {
                    result = binarySearch(nums, mid+1, end, target);
                }
                if(result == -1) {
                    result = binarySearch(nums, start, mid-1, target);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Ex33 ex33 = new Ex33();
        System.out.println(ex33.search(new int[]{5,6,7,0,1,2,3,4}, 2));
    }
}

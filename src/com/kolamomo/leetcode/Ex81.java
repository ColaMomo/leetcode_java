package com.kolamomo.leetcode;

/**
 * Search in Rotated Sorted Array II
 *
 * <p>Follow up for "Search in Rotated Sorted Array": <br>
 * What if duplicates are allowed?<br>
 * Would this affect the run-time complexity? How and why?<br>
 * Write a function to determine if a given target is in the array. <br>
 *
 * @author jay
 */
public class Ex81 {
    public boolean search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }

    private boolean binarySearch(int []nums, int start, int end, int target) {
        if(start > end) {
            return false;
        } else {
            boolean result = false;

            int mid = (start + end) / 2;
            if(nums[mid] == target) {
                return true;
            } else if(nums[mid] < target) {
                if(nums[start] >= nums[mid]) {
                    result = binarySearch(nums, start, mid - 1, target);
                }
                if(!result) {
                    result = binarySearch(nums, mid+1, end, target);
                }
            } else {
                if(nums[end] <= nums[mid]) {
                    result = binarySearch(nums, mid+1, end, target);
                }
                if(!result) {
                    result = binarySearch(nums, start, mid-1, target);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Ex81 ex81 = new Ex81();
        System.out.println(ex81.search(new int[]{1,3,1,1,1}, 3));
    }
}

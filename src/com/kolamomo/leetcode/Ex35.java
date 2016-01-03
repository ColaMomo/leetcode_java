package com.kolamomo.leetcode;


/**
 * Search Insert Position
 * 
 * <p>Given a sorted array and a target value, return the index if the target is found. <br>
 * If not, return the index where it would be if it were inserted in order.<br>
 * You may assume no duplicates in the array.<br><br>
 * 
 * Here are few examples.<br>
 * [1,3,5,6], 5 → 2<br>
 * [1,3,5,6], 2 → 1<br>
 * [1,3,5,6], 7 → 4<br>
 * [1,3,5,6], 0 → 0<br>
 * 
 * @note 二分查找
 * @author Jay
 *
 */
public class Ex35 {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }
    
    private int binarySearch(int[] nums, int begin, int end, int target) {
    	if(begin > end) {
    		if(end == -1) {
    			return 0;
    		} else if(begin == nums.length) {
    			return nums.length;
    		} else {
    			return begin;
    		}
    	}
    	int mid = (begin + end) / 2;
    	if(nums[mid] == target) {
    		return mid;
    	} else if(nums[mid] < target) {
    		return binarySearch(nums, mid+1, end, target);
    	} else {
    		return binarySearch(nums, begin, mid-1, target);
    	}
    }
    
    public static void main(String[] args) {
    	Ex35 ex35 = new Ex35();
    	System.out.println(ex35.searchInsert(new int[]{1, 10, 20, 30}, 5));
    }

}

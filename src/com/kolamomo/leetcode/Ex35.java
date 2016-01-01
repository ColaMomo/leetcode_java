package com.kolamomo.leetcode;

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

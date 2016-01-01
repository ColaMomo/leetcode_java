package com.kolamomo.leetcode;

import java.util.Arrays;

public class Ex34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1, -1};
        binarySearch(nums, 0, nums.length - 1, target, result);
        return result;
    }
    
    private void binarySearch(int[] nums, int begin, int end, int target, int[] result) {
    	if(begin > end) {
    		result = new int[]{-1, -1};
    		return;
    	}
    	int mid = (begin + end) / 2;
    	if(nums[mid] == target) {
    		int i = mid;
    		while(i >= 0 && nums[i] == target) {
    			i--;
    		}
    		result[0] = i+1;
    		int j = mid;
    		while(j <= nums.length - 1 && nums[j] == target) {
    			j++;
    		}
    		result[1] = j-1;
    		return;
    	} else if(nums[mid] < target) {
    		binarySearch(nums, mid+1, end, target, result);
    	} else {
    		binarySearch(nums, begin, mid-1, target, result);
    	}
    }
    
    public static void main(String[] args) {
    	Ex34 ex34 = new Ex34();
    	System.out.println(Arrays.toString(ex34.searchRange(new int[]{1, 2, 3,3, 3, 4,5}, 3)));
    }
}

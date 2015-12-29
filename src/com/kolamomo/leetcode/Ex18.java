package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++) { 
        	if(i > 0 && nums[i] == nums[i - 1]) {
        		continue;
        	}
        	for(int j = i+1; j < nums.length - 2; j++) {
        		if(j > i + 1 && nums[j] == nums[j - 1]) {
        			continue;
        		}
        		int k = j +1;
        		int r = nums.length - 1;
            	while(k < r) {
            		int temp = nums[i] + nums[j] + nums[k] + nums[r] - target;
            		if(temp < 0) {
            			k++;
            		} else if(temp > 0) {
            			r--;
            		} else {
            			result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[r]));
            			while(++k < r && nums[k] == nums[k - 1]) {
            			} 
            			while(k < --r && nums[r] == nums[r + 1]) {
            			} 
            		}
            	}
        	}
        }
        return result;
    }
}

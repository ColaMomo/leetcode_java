package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 4Sum
 * 
 * <p>Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? <br>
 * Find all unique quadruplets in the array which gives the sum of target. <br> <br>
 * 
 * Note: <br>
 * Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d) <br>
 * The solution set must not contain duplicate quadruplets. <br>
 *     For example, given array S = {1 0 -1 0 -2 2}, and target = 0. <br>
 *     A solution set is: <br>
 *     (-1,  0, 0, 1) <br>
 *     (-2, -1, 1, 2) <br>
 *     (-2,  0, 0, 2) <br>
 *     
 * @note 注意排重
 * @author Jay
 *
 */
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

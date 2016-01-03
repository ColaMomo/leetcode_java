package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3Sum
 * 
 * <p>Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? <br>
 * Find all unique triplets in the array which gives the sum of zero <br>
 * 
 * Note: <br>
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c) <br>
 * The solution set must not contain duplicate triplets. <br>
 * 
 *    For example, given array S = {-1 0 1 2 -1 -4}, <br>
 *    A solution set is: <br>
 *    (-1, 0, 1) <br>
 *    (-1, -1, 2) <br>
 *    
 * @author Jay
 *
 */
public class Ex15 {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
        	if(i > 0 && nums[i] == nums[i - 1]) {
        		continue;
        	}
        	int j = i+1;
        	int k= nums.length - 1;
        	while(j < k) {
        		int sum = nums[i] + nums[j] + nums[k];
        		if(sum < 0) {
        			j++;
        		} else if(sum > 0) {
        			k--;
        		} else {
        			result.add(Arrays.asList(nums[i], nums[j], nums[k]));
        			while(++j < k && nums[j] == nums[j - 1]) {
        			} 
        			while(j < --k && nums[k] == nums[k + 1]) {
        			} 
        		}
        	}
        }
        return result;
    }
    
    public static void main(String[] args) {
    	Ex15 ex15 = new Ex15();
    	int[] nums = {-1, 0, 1};
    	List<List<Integer>> result = ex15.threeSum(nums);
    	for(int i = 0; i < result.size(); i++) {
    		System.out.println((Integer [])result.get(i).toArray());
    	}
    }
    
    
}

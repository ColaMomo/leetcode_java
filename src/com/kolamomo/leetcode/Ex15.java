package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

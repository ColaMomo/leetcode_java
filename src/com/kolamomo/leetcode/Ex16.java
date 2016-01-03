package com.kolamomo.leetcode;

import java.util.Arrays;

/**
 * 3Sum Closest
 * 
 * <p>Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.<br> 
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.<br>
 *     For example, given array S = {-1 2 1 -4}, and target = 1.<br>
 *     The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).<br>
 * @author Jay
 *
 */
public class Ex16 {
	public int threeSumClosest(int[] nums, int target) {
		int min = Integer.MAX_VALUE;
		int resultSum = 0;
		Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2;  i++) {
        	if(i > 0 && nums[i] == nums[i - 1]) {
        		continue;
        	}
        	int j = i+1;
        	int k= nums.length - 1;
        	while(j < k) {
        		int temp = nums[i] + nums[j] + nums[k] - target;
        		if(Math.abs(temp) < min) {
        			min = Math.abs(temp);
        			resultSum = temp + target;
        		}
        		if(temp < 0) {
        			j++;
        		} else if(temp > 0) {
        			k--;
        		} else {
        			return target;
        		}
        	}
        }
        return resultSum;
    }
	
    public static void main(String[] args) {
    	Ex16 ex16 = new Ex16();
    	int[] nums = {1, 1,1,1};
    	System.out.println(ex16.threeSumClosest(nums, 0));
    }
}

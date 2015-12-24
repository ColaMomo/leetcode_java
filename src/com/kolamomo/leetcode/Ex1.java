package com.kolamomo.leetcode;

import java.util.Arrays;

public class Ex1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
        	for(int j = i + 1; j < nums.length; j++) {
        		if(nums[i] + nums[j] == target) {
        			return new int[] {i+1, j+1};
        		}
        	}
        }
        return new int[2];
    }
    
    public static void main(String args[]) {
    	Ex1 ex1 = new Ex1();
    	int [] nums = {0,1,3,4,5,6,7};
    	System.out.println(Arrays.toString(ex1.twoSum(nums, 12)));
    }
}

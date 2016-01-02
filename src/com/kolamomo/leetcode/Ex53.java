package com.kolamomo.leetcode;

public class Ex53 {
    public int maxSubArray(int[] nums) {
    	int max = Integer.MIN_VALUE;
    	boolean negativeTag = true;
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] >= 0) {
    			negativeTag = false;
    			break;
    		}
    		if(nums[i] > max) {
    			max = nums[i];
    		}
    	}
    	if(negativeTag) {
    		return max;
    	}
    	
        int sum = nums[0];
        max = sum;
        for(int i = 1; i < nums.length; i++) {
        	if(sum < 0) {
        		sum = 0;
        	}
        	sum += nums[i];
        	if(sum > max) {
        		max = sum;
        	}
        }
        return max;
    }
    
    public static void main(String[] args) {
    	Ex53 ex53 = new Ex53();
    	System.out.println(ex53.maxSubArray(new int[]{-2, 1}));
    }
}

package com.kolamomo.leetcode;

public class Ex55 {
    public boolean canJump(int[] nums) {
    	int min = nums.length - 1;
    	for(int i = nums.length - 2; i >= 0; i--) {
        	int n = nums[i];
        	if(n == 0) {
        		continue;
        	}
        	if(i + n >= min) {
        		min = i;
        	}
        }
        return min == 0;
    }

	/*
    public boolean canJump(int[] nums) {
    	int[] tags = new int[nums.length];
    	tags[nums.length - 1] = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
        	int n = nums[i];
        	int j = 1;
        	for(; j <= n; j++) {
        		if(i + j <= nums.length - 1 && tags[i + j] == 1) {
        			tags[i] = 1;
        			break;
        		}
        	}
        	if(j == n + 1 || n == 0) {
        		tags[i] = 0;
        	}
        }
        return tags[0] == 1;
    }
    */

	
	/*
    public boolean canJump(int[] nums) {
    	int[] tags = new int[nums.length];
        return doCanJump(nums, 0, tags);
    }
    
    private boolean doCanJump(int[] nums, int index, int[] tags) {
    	if(tags[index] == 1) {
    		return false;
    	}
        while(index < nums.length - 1) {
        	int n= nums[index];
        	if(n == 0) {
        		break;
        	}
        	for(int i = 1; i <= n; i++) {
        		if(tags[index] == 0 && doCanJump(nums, index+i, tags)) {
        			return true;
        		}
        	}
        	tags[index] = 1;
        	return false;
        }
        if(index == nums.length - 1) {
        	return true;
        } else {
        	tags[index] = 1;
        	return false;
        }
    }
    */
    
    public static void main(String[] args) {
    	Ex55 ex55 = new Ex55();
    	System.out.println(ex55.canJump(new int[]{1, 1,1 , 1, 0,0}));

    	System.out.println(ex55.canJump(new int[]{2,3,1,1,4}));
    	System.out.println(ex55.canJump(new int[]{3, 2, 1,0,4}));
    	System.out.println(ex55.canJump(new int[]{2,0}));
    	System.out.println(ex55.canJump(new int[]{2,0,6,9,8,4,5,0,8,9,1,2,9,6,8,8,0,6,3,1,2,2,1,2,6,5,3,1,2,2,6,4,2,4,3,0,0,0,3,8,2,4,0,1,2,0,1,4,6,5,8,0,7,9,3,4,6,6,5,8,9,3,4,3,7,0,4,9,0,9,8,4,3,0,7,7,1,9,1,9,4,9,0,1,9,5,7,7,1,5,8,2,8,2,6,8,2,2,7,5,1,7,9,6}));
    	
    	
    }
}

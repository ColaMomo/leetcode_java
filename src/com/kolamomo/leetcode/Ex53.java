package com.kolamomo.leetcode;

/**
 * Maximum Subarray (最大子序列和)
 * 
 * <p>Find the contiguous subarray within an array (containing at least one number) which has the largest sum.<br><br>
 * 
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],<br>
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.<br>
 * @author Jay
 *
 */
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

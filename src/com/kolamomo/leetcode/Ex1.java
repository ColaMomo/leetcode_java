package com.kolamomo.leetcode;

import java.util.Arrays;

/**
 * Two Sum
 * 
 * <p>Given an array of integers, find two numbers such that they add up to a specific target number.<br>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. <br>
 * Please note that your returned answers (both index1 and index2) are not zero-based.<br>
 * You may assume that each input would have exactly one solution.<br><br>
 * 
 * Input: numbers={2, 7, 11, 15}, target=9<br>
 * Output: index1=1, index2=2<br>
 * 
 * @author Jay
 *
 */
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

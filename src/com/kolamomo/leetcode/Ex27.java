package com.kolamomo.leetcode;

/**
 * Remove Element
 * 
 * <p>Given an array and a value, remove all instances of that value in place and return the new length. <br>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length. <br>
 * @author Jay
 *
 */
public class Ex27 {
	public int removeElement(int[] nums, int val) {
		int[] tempNums = new int[nums.length];
		int index = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != val) {
				tempNums[index++] = nums[i];
			}
		}
		for(int i = 0; i < index; i++) {
			nums[i] = tempNums[i];
		}
		return index;
	}
	
	public static void main(String args[]) {
		Ex27 ex27 = new Ex27();
		int[] nums = {1,2,3,4,3,5,7,2,4};
		int count = ex27.removeElement(nums, 3);
		for(int i = 0; i < count; i++){
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
}
 
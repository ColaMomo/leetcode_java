package com.kolamomo.leetcode;

/**
 * Remove Duplicates from Sorted Array (有序数组去重)
 * 
 * <p>Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.<br>
 * Do not allocate extra space for another array, you must do this in place with constant memory.<br><br>
 * For example,<br>
 * Given input array nums = [1,1,2],<br>
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. <br>
 * It doesn't matter what you leave beyond the new length.
 * @author Jay
 *
 */
public class Ex26 {
    public int removeDuplicates(int[] nums) {
    	int index = 0;
    	int length = nums.length;
    	int n;
        while(index < length ) {
        	n = nums[index];
        	int count = 0;
        	for(int i = index+1; i < length; i++) {
        		if(nums[i] == n) {
        			count++;
        		} else {
        			break;
        		}
        	}
        	if(count != 0) {
        		for(int i = index + 1; i < length-count; i++) {
        			nums[i] = nums[i+count];
        		}
        	}
        	length -= count;
        	index++;
        }
        return length;
    }
    
    public static void main(String[] args) {
    	Ex26 ex26 = new Ex26();
//    	int[] nums = {1, 2,3,3,4,4,4,5,5,5,5,5,5,7};
    	int[] nums = {1};
    	int count = ex26.removeDuplicates(nums);
    	for(int i = 0; i < count; i++) {
    		System.out.print(nums[i] + " ");
    	}
    	System.out.println();
    }
}

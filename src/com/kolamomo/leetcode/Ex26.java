package com.kolamomo.leetcode;

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

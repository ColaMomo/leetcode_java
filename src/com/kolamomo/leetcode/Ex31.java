package com.kolamomo.leetcode;

import java.util.Arrays;

public class Ex31 {
    public void nextPermutation(int[] nums) {
    	int swap1 = -1;
    	int swap2 = -1;
        for(int i = nums.length-1; i > 0; i--) {
        	for(int j = i -1; j >= 0; j--) {
        		if(nums[i] > nums[j]) {
        			if(j > swap1) {
        				swap1 = j;
        				swap2 = i;
        				break;
        			}
        		}
        	}
        }
        
        if(swap1 != -1 ) {
			int temp = nums[swap2];
			nums[swap2] = nums[swap1];
			nums[swap1] = temp;
			int[] tempArr = new int[nums.length - swap1 - 1];
			for(int k = swap1 + 1; k < nums.length; k++) {
				tempArr[k - swap1 - 1] = nums[k];
			}
	        Arrays.sort(tempArr);
	        for(int k = swap1 + 1; k < nums.length; k++) {
	        	nums[k] = tempArr[k - swap1 -1];
	        }
		} else {
			Arrays.sort(nums);
		}
    }
    
    public static void main(String[] args) {
    	Ex31 ex31 = new Ex31();
//    	int[] nums = {1,3,2};
//    	int[] nums = {2,3,1};
    	int[] nums = {4, 2,0,2,3,2,0};
    	ex31.nextPermutation(nums);
    	System.out.println(Arrays.toString(nums));
    }
}

package com.kolamomo.leetcode;

import java.util.Arrays;

/**
 * Next Permutation
 * 
 * <p>Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.<br>
 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).<br>
 * The replacement must be in-place, do not allocate extra memory.<br><br>
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.<br>
 * 1,2,3 → 1,3,2<br>
 * 3,2,1 → 1,2,3<br>
 * 1,1,5 → 1,5,1<br>
 * @author Jay
 *
 */
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

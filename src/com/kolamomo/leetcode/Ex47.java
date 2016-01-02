package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
    	List<List<Integer>> resultList = new ArrayList<List<Integer>> ();
        doPermute(nums, 0, nums.length-1, resultList);
        return resultList;
    }
    
    private void  doPermute(int []nums, int index, int length, List<List<Integer>> resultList ) {
    	if(index == length) {
    		List<Integer> list = new ArrayList<Integer> ();
    		for(int i = 0; i < nums.length; i++) {
    			list.add(nums[i]);
    		}
    		resultList.add(list);
    	} else {
    		for(int i = index; i <= length; i++) {
    			boolean skip = false;
    			for(int j = index; j <= i-1; j++) {
    				if(nums[j] == nums[i]) {
    					skip = true;
    					break;
    				}
    			}
    			if(skip) {
    				continue;
    			}
    			int temp = nums[index];
    			nums[index] = nums[i];
    			nums[i] = temp;
    			doPermute(nums, index+1, length, resultList);
    			temp = nums[index];
    			nums[index] = nums[i];
    			nums[i] = temp;
    		}
    	}
    } 
    
    public static void main(String[] args) {
    	Ex47 ex47 = new Ex47();
    	List<List<Integer>> resultList = ex47.permuteUnique(new int[]{2, 1, 1, 1});
    	for(int i = 0; i < resultList.size(); i++) {
    		System.out.println(Arrays.toString(resultList.get(i).toArray(new Integer[0])));
    	}
    }

}

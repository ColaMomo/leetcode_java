package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Permutations (字符串全排列问题)
 * 
 * <p>Given a collection of distinct numbers, return all possible permutations.<br><br>
 * 
 * For example,<br>
 * [1,2,3] have the following permutations:<br>
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].<br>
 * @author Jay
 *
 */
public class Ex46 {
    public List<List<Integer>> permute(int[] nums) {
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
    	Ex46 ex46 = new Ex46();
    	List<List<Integer>> resultList = ex46.permute(new int[]{1, 2, 3});
    	for(int i = 0; i < resultList.size(); i++) {
    		System.out.println(Arrays.toString(resultList.get(i).toArray(new Integer[0])));
    	}
    }
}

package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<List<Integer>> result = new ArrayList<List<Integer>> ();
    	Arrays.sort(candidates);
    	int[] tempArr = new int[target / candidates[0] + 1];
    	doCombination(candidates, 0, tempArr, 0, target, false, result);
    	return result;
    }
    
    private void doCombination(int[] candidates, int index, int[] tempArr, int arrIndex, int target, boolean tag, List<List<Integer>> resultList) {
    	if(target == 0 && !tag) {
			List<Integer> list = new ArrayList<Integer> ();
			for(int i = 0; i < arrIndex; i++) {
				list.add(tempArr[i]);
			}
    		resultList.add(list);
    	} else if(target < 0 || index == candidates.length) {
    		return;
    	} else {
    		if(!tag) {
    			doCombination(candidates, index+1, tempArr, arrIndex, target, false, resultList);
    		}
    		tempArr[arrIndex] = candidates[index];
            doCombination(candidates, index, tempArr, arrIndex+1, target-candidates[index], true, resultList);
    		doCombination(candidates, index+1, tempArr, arrIndex+1, target-candidates[index], false, resultList);
    	}
    }
    
    public static void main(String args[]) {
    	Ex39 ex39 = new Ex39();
    	List<List<Integer>> result = ex39.combinationSum(new int[]{ 2, 4}, 4);
    	for(int i = 0 ; i < result.size(); i++) {
    		List<Integer> temp = result.get(i);
    		for(int j = 0; j < temp.size(); j++) {
    			System.out.print(temp.get(j) + " ");
    		}
    		System.out.println();	
    	}
    }
}
package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Ex40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	List<List<Integer>> result = new ArrayList<List<Integer>> ();
    	Arrays.sort(candidates);
    	int[] tempArr = new int[candidates.length];
    	doCombination(candidates, 0, tempArr, 0, target, false, result);
    	return result;
    }
    
    private void doCombination(int[] candidates, int index, int[] tempArr, int arrIndex, int target, boolean tag, List<List<Integer>> resultList) {
    	if(target == 0) {
			List<Integer> list = new ArrayList<Integer> ();
			for(int i = 0; i < arrIndex; i++) {
				list.add(tempArr[i]);
			}
    		resultList.add(list);
    	} else if(target < 0 || index == candidates.length) {
    		return;
    	} else {
    		doCombination(candidates, index+1, tempArr, arrIndex, target, false, resultList);
    		boolean duplicate = (index > 0 && candidates[index] == candidates[index - 1]);
    		if(!duplicate || tag ) {
    			tempArr[arrIndex] = candidates[index];
        		doCombination(candidates, index+1, tempArr, arrIndex+1, target-candidates[index], true, resultList);
    		}
    	}
    }
    
    public static void main(String args[]) {
    	Ex40 ex40 = new Ex40();
    	List<List<Integer>> result = ex40.combinationSum2(new int[]{2, 2, 2, 2, 2, 4}, 6);
    	for(int i = 0 ; i < result.size(); i++) {
    		List<Integer> temp = result.get(i);
    		for(int j = 0; j < temp.size(); j++) {
    			System.out.print(temp.get(j) + " ");
    		}
    		System.out.println();	
    	}
    }
}

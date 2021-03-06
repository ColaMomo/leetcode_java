package com.kolamomo.leetcode;

import com.kolamomo.leetcode.utils.ListUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Subsets II
 *
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets.
 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 *
 * For example,
 * If nums = [1,2,2], a solution is:
 * [
 * [2],
 * [1],
 * [1,2,2],
 *  [2,2],
 * [1,2],
 *  []
 * ]
 *
 * @author jay
 */
public class Ex90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length; i++) {
            Integer[] temp = new Integer[nums.length];
            doGetSubsets(nums, 0, nums.length-1, 0, i, false, temp, result);
        }
        return result;
    }

    private void doGetSubsets(int[] nums, int start, int end, int index, int length, boolean addDuplicate, Integer[] temp, List<List<Integer>> result) {
        if(index == length) {
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < index; i++) {
                list.add(temp[i]);
            }
            result.add(list);
        } else {
            if(start <= end) {
                doGetSubsets(nums, start + 1, end, index, length, false, temp, result);
                if(start > 0 && nums[start] == nums[start - 1]) {
                    if(addDuplicate) {
                        temp[index] = nums[start];
                        doGetSubsets(nums, start + 1, end, index + 1, length, true, temp, result);
                    }
                } else {
                    temp[index] = nums[start];
                    doGetSubsets(nums, start + 1, end, index + 1, length, true, temp, result);
                }
            }
        }
    }

    public static void main(String[] args) {
        Ex90 ex90 = new Ex90();
        List<List<Integer>> result = ex90.subsetsWithDup(new int[]{1, 2, 2, 2});
        ListUtils.printNestList(result);
    }
}

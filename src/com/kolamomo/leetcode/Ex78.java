package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Subsets
 *
 * <p>Given a set of distinct integers, nums, return all possible subsets. <br>
 * Note:<br>
 * Elements in a subset must be in non-descending order.<br>
 * The solution set must not contain duplicate subsets.<br><br>
 *
 * For example,<br>
 * If nums = [1,2,3], a solution is:<br>
 * [<br>
 * [3],<br>
 * [1],<br>
 * [2],<br>
 * [1,2,3],<br>
 * [1,3],<br>
 * [2,3],<br>
 * [1,2],<br>
 * []<br>
 ] */
public class Ex78 {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i <= nums.length; i++) {
            int arr[] = new int[i];
            doCombination(nums, 0, nums.length - 1, 0, i, arr, result);
        }
        return result;
    }

    private void doCombination(int[] nums, int start, int end, int index, int k, int[] arr, List<List<Integer>> result) {
        if(index == k) {
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            result.add(list);
        } else {
            for(int i = start; i <= end; i++) {
                arr[index] = nums[i];
                doCombination(nums, i+1, end, index+1, k, arr, result);
            }
        }
    }

    public static void main(String[] args) {
        Ex78 ex78 = new Ex78();
        List<List<Integer>> result = ex78.subsets(new int[]{1, 2, 3});
        for(List<Integer> list : result) {
            for(Integer num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}

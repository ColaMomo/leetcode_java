package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Combinations
 *
 * <p>Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.<br><br>
 *
 * For example,<br>
 * If n = 4 and k = 2, a solution is:<br>
 * [<br>
 * [2,4],<br>
 * [3,4],<br>
 * [2,3],<br>
 * [1,2],<br>
 * [1,3],<br>
 *  [1,4],<br>
 * ]<br>
 */
public class Ex77 {
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[k];
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        doCombination(arr, 0, 1, n, k, result);
        return result;
    }

    private void doCombination(int[] arr, int index, int start, int end, int k, List<List<Integer>> result) {

        if(index == k) {
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            result.add(list);
        } else {
            for(int i = start; i <= end; i++) {
                arr[index] = i;
                doCombination(arr, index+1, i+1, end, k, result);
            }
        }
    }

    public static void main(String[] args) {
        Ex77 ex77 = new Ex77();
        List<List<Integer>> result = ex77.combine(4, 2);
        for(List<Integer> list : result) {
            for(Integer num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

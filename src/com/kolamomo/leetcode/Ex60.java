package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Permutation Sequence
 * 
 * <p>The set [1,2,3,…,n] contains a total of n! unique permutations.<br>
 * By listing and labeling all of the permutations in order,<br>
 * We get the following sequence (ie, for n = 3):<br>
 * "123"<br>
 * "132"<br>
 * "213"<br>
 * "231"<br>
 * "312"<br>
 * "321"<br>
 * Given n and k, return the kth permutation sequence.<br>
 * Note: Given n will be between 1 and 9 inclusive.<br>
 * @author jiangchao
 *
 */
public class Ex60 {
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<Integer> ();
        for(int i = 0; i < n; i++) {
        	list.add(i+1);
        }
        
        String result = "";
        for(int i = 0; i < n - 1; i++) {
        	int index = (k - 1) / (calculateJieCheng(n - 1 - i));
        	result += list.get(index);
        	list.remove(index);
        	k = k - index * calculateJieCheng(n - 1 - i);
        }
        result += list.get(0);
        return result;
    }
    
    public int calculateJieCheng(int n) {
    	int result = 1;
    	for(int i = 2; i <= n; i++) {
    		result *= i;
    	}
    	return result;
    }
    public static void main(String[] args) {
    	Ex60 ex60 = new Ex60();
    	System.out.println(ex60.getPermutation(4, 13));
    }

}

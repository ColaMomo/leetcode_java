package com.kolamomo.leetcode;

import java.util.Arrays;

/**
 * Spiral Matrix II
 * 
 * <p>Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.<br><br>
 * 
 * For example,<br>
 * Given n = 3,<br>
 * You should return the following matrix:<br>
 * [<br>
 *  [ 1, 2, 3 ],<br>
 *  [ 8, 9, 4 ],<br>
 *  [ 7, 6, 5 ]<br>
 * ]<br>
 * @author jiangchao
 *
 */
public class Ex59 {
    public int[][] generateMatrix(int n) {
    	int num = 0;
    	int[][] result = new int[n][n];
    	int i = 0; 
    	int j = -1;
    	while(num < n*n) {
    		while(j + 1 < n && result[i][j+1] == 0) {
    			result[i][++j] = ++num;
    		}
    		while(i + 1 < n && result[i+1][j] == 0) {
    			result[++i][j] = ++num;
    		}
    		while(j - 1 >= 0 && result[i][j-1] == 0) {
    			result[i][--j] = ++num;
    		}
    		while(i - 1 >= 0 && result[i-1][j] == 0) {
    			result[--i][j] = ++num;
    		}
    	}
    	return result;
    }
    
    public static void main(String[] args) {
    	Ex59 ex59 = new Ex59();
    	int[][] result = ex59.generateMatrix(4);
    	for(int i = 0; i < result.length; i++) {
    		System.out.println(Arrays.toString(result[i]));
    	}
    }
}

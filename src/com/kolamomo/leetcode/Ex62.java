package com.kolamomo.leetcode;

/**
 * Unique Paths My Submissions Question
 * 
 * <p>A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).<br>
 * The robot can only move either down or right at any point in time.<br>
 * The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).<br>
 * How many possible unique paths are there?<br>
 * Note: m and n will be at most 100.<br>
 * @author jiangchao
 *
 */
public class Ex62 {
    public int uniquePaths(int m, int n) {
    	int[][] arr = new int[m][n];
    	for(int i = 0; i < m; i++) {
    		arr[i][0] = 1;
    	}
    	for(int j = 0; j < n; j++) {
    		arr[0][j] = 1;
    	}
    	for(int i = 1; i < m; i++) {
    		for(int j = 1; j < n; j++) {
    			arr[i][j] = arr[i][j-1] + arr[i-1][j];
    		}
    	}
    	return arr[m-1][n-1];
    }
	
	//递归求解 超时
	/*
    public int uniquePaths(int m, int n) {
    	return findPath(0,0,m,n);
    }
    
    public int findPath(int i, int j, int m, int n) {
    	int path = 0;
    	if(i == m - 1 && j == n - 1) {
    		return 1;
    	} 
    	if(i < m - 1) {
    		path += findPath(i+1, j, m , n);
    	}
    	if(j < n - 1) {
    		path += findPath(i, j+1, m, n);
    	}
    	return path;
    }
    */
    public static void main(String[] args) {
    	Ex62 ex62 = new Ex62();
    	System.out.println(ex62.uniquePaths(23, 12));
    }
}

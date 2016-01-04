package com.kolamomo.leetcode;

/**
 * Unique Paths II
 * 
 * <p>Follow up for "Unique Paths":<br>
 * Now consider if some obstacles are added to the grids. <br>
 * How many unique paths would there be?<br>
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.<br><br>
 * For example,<br>
 * There is one obstacle in the middle of a 3x3 grid as illustrated below.<br>
 * [<br>
 *   [0,0,0],<br>
 *   [0,1,0],<br>
 *   [0,0,0]<br>
 * ]<br>
 * The total number of unique paths is 2.<br>
 * Note: m and n will be at most 100.<br>
 * @author Jay
 *
 */
public class Ex63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	int m = obstacleGrid.length;
    	if(m == 0) {
    		return 0;
    	}
    	int n = obstacleGrid[0].length;
    	if(obstacleGrid[m-1][n-1] == 1 || obstacleGrid[0][0] == 1) {
    		return 0;
    	}
    	int[][] pathArr = new int[m][n];
    	int i = 0;
    	while(i < m) {
    		if(obstacleGrid[i][0] == 0) {
    			pathArr[i++][0] = 1;
    		} else {
    			pathArr[i++][0] = 0;
    			break;
    		}
    	}
    	while(i < m) {
    		pathArr[i++][0] = 0;
    	}
    	int j = 0;
    	while(j < n) {
    		if(obstacleGrid[0][j] == 0) {
    			pathArr[0][j++] = 1;
    		} else {
    			pathArr[0][j++] = 0;
    			break;
    		}
    	}
    	while(j < n) {
    		pathArr[0][j++] = 0;
    	}
    	for(i = 1; i < m; i++) {
    		for(j = 1; j < n; j++) {
    			if(obstacleGrid[i][j] == 1) {
    				pathArr[i][j] = 0;
    			} else {
    				pathArr[i][j] = pathArr[i -1][j] + pathArr[i][j - 1];
    			}
    		}
    	}
    	return pathArr[m-1][n-1];
    }
    
    public static void main(String[] args) {
    	Ex63 ex63 = new Ex63();
    	System.out.println(ex63.uniquePathsWithObstacles(new int[][]{{0,0},{1, 1},{0,0}}));
    }

}

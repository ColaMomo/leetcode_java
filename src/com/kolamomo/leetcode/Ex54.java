package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Ex54 {
    public List<Integer> spiralOrder(int[][] matrix) {
    	int n = matrix.length;
    	if(n == 0) {
    		return new ArrayList<Integer> ();
    	}

    	int m = matrix[0].length;
    	List<Integer> result = new ArrayList<Integer> ();
    	for(int k = 0; k < (Math.min(n, m) + 1)/ 2; k++) {
    		int i = k;
    		int j = k-1;
    		int tag = 0;
    		while(++j < m - k) {
    			tag = 1;
    			result.add(matrix[i][j]);
    		}
    		j--;
    		if(tag != 1) {
    			break;
    		}
    		while( ++i < n - k) {
    			tag = 2;
    			result.add(matrix[i][j]);
    		}
    		if(tag != 2) {
    			break;
    		}

    		i--;
    		while(--j >= k) {
    			tag = 3;
    			result.add(matrix[i][j]);
    		}
    		if(tag != 3) {
    			break;
    		}

    		j++;
    		while(--i >= k + 1) {
    			result.add(matrix[i][j]);
    		}
    	}
        return result;
    }
    
    public static void main(String[] args) {
    	Ex54 ex54 = new Ex54();
    	List<Integer> result = ex54.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9, 10,11,12}});
    	System.out.println(result.toString());
    }
}

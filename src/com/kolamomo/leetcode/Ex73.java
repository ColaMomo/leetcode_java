package com.kolamomo.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Set Matrix Zeroes
 *
 * <p>Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.<br>
 *
 *     @author jiangchao
 */
public class Ex73 {
    public void setZeroes(int [][] matrix) {
        Set<Integer> rowSet = new HashSet<Integer>();
        Set<Integer> columnSet = new HashSet<Integer>();

        int n = matrix.length;
        if(n == 0) {
            return;
        }
        int m = matrix[0].length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == 0) {
                    rowSet.add(i);
                    columnSet.add(j);
                }
            }
        }

        for(Integer rowIndex : rowSet) {
            for(int j = 0; j < m; j++) {
                matrix[rowIndex][j] = 0;
            }
        }

        for(Integer columnIndex : columnSet) {
            for(int i = 0; i < n; i++) {
                matrix[i][columnIndex] = 0;
            }
        }
    }
}

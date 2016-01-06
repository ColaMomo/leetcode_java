package com.kolamomo.leetcode;

/**
 * Search a 2D Matrix
 *
 * <p>Write an efficient algorithm that searches for a value in an m x n matrix. <br>
 * This matrix has the following properties:<br>
 * Integers in each row are sorted from left to right.<br>
 * The first integer of each row is greater than the last integer of the previous row.<br><br>
 *
 * For example,<br>
 * Consider the following matrix:<br>
 * [<br>
 * [1,   3,  5,  7],<br>
 * [10, 11, 16, 20],<br>
 * [23, 30, 34, 50]<br>
 * ]<br>
 * Given target = 3, return true. <br>
 *
 *     @author jiangchao
 */
public class Ex74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        if(n == 0) {
            return false;
        }
        int m = matrix[0].length;
        int i = 0;
        int j = m-1;
        while(i < n && j >= 0) {
            int num = matrix[i][j];
            if(num == target) {
                return true;
            } else if(num > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}

package com.kolamomo.leetcode;

/**
 * You are given an n x n 2D matrix representing an image.
 * Rotate the image by 90 degrees (clockwise).
 * Follow up:
 * Could you do this in-place?
 * @author Jay
 *
 */
public class Ex48 {
    public void rotate(int[][] matrix) {
    	for(int i = 0; i < matrix.length / 2; i++) {
    		for(int j = i; j < matrix.length -i - 1; j++) {
	    		int temp = matrix[i][j];
	    		matrix[i][j] = matrix[matrix.length-1-j][i];
	        	matrix[matrix.length-1-j][i] = matrix[matrix.length-1-i][matrix.length-1-j];
	        	matrix[matrix.length-1-i][matrix.length-1-j] = matrix[j][matrix.length-1-i];
	        	matrix[j][matrix.length-1-i] = temp;
    		}
    	}   
    }
    
    private void printMatrix(int[][] matrix) {
    	for(int i = 0; i < matrix.length; i++) {
    		for(int j = 0; j < matrix.length; j++) {
    			System.out.print(matrix[i][j]);
    		}
    		System.out.println();
    	}
		System.out.println("---");
    }
    
    public static void main(String[] args) {
    	Ex48 ex48 = new Ex48();
    	int[][] matrix = new int[][] {{1, 2, 3}, { 4, 5, 6 }, {7, 8, 9}};
    	ex48.printMatrix(matrix);
    	ex48.rotate(matrix);
    	ex48.printMatrix(matrix);
    }
}

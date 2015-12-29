package com.kolamomo.leetcode;

public class Ex11 {
    public int maxArea(int[] height) {
    	int max = 0;
    	int i = 0; 
    	int j = height.length - 1;
        while(i < j) {
        	int temp = (j - i) * Math.min(height[i], height[j]);
        	if(temp > max) {
        		max = temp;
        	} 
        	if(height[i] > height[j]) {
        		j--;
        	} else {
        		i++;
        	}
        }
        return max;
    }
}

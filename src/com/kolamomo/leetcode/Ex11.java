package com.kolamomo.leetcode;

/**
 * Container With Most Water
 * 
 * <p>Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). <br>
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). <br>
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.<br>
 * Note: You may not slant the container.<br>
 * 
 * <p>贪心法
 * @author Jay
 *
 */
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

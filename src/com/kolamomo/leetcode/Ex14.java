package com.kolamomo.leetcode;

/**
 * Longest Common Prefix (最长公共前缀问题)
 * 
 * <p>Write a function to find the longest common prefix string amongst an array of strings.
 * @author Jay
 *
 */
public class Ex14 {
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length == 0) {
    		return "";
    	}
    	if(strs.length == 1) {
    		return strs[0];
    	}
    	int index = 0;
    	while(true) {
    		int i = 1;
	        for(; i < strs.length; i++) {
	        	if(index >= strs[0].length() || index >= strs[i].length() || strs[i].charAt(index) != strs[0].charAt(index)) {
	        		break;
	        	}
	        }
	        if(i == strs.length) {
	        	return strs[0].substring(0, index);
	        }
	        index++;
    	}
    }
    
    public static void main(String[] args){
    	Ex14 ex14 = new Ex14();
    	String[] strs = {"abcd", "abghg", "abcdd","abre"};
    	System.out.println(ex14.longestCommonPrefix(strs));
    }
}

package com.kolamomo.leetcode;

public class Ex5 {
	
	
	
	//暴力法，O(n^3)，超时
	/*
    public String longestPalindrome(String s) {
    	int max = 0;
    	String result = "";
        for(int i = 0; i < s.length(); i++) {
        	for(int j = i + 1 + max; j <= s.length(); j++) {
        		String temp = s.substring(i, j);
        		if(isPalindrome(temp)) {
        			if(j - i > max) {
        				max = j - i;
        				result = temp;
        			}
        		}
        	}
        }
        return result;
    }
    
    private boolean isPalindrome(String s) {
    	for(int i = 0; i < s.length() / 2; i++) {
    		if(s.charAt(i) != s.charAt(s.length() - 1- i)) {
    			return false;
    		}
    	}
    	return true;
    }
    */
    public static void main(String[] args) {
    	Ex5 ex5 = new Ex5();
    	System.out.println(ex5.longestPalindrome("aaaabaaa"));
    }
}

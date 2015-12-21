package com.kolamomo.leetcode;

public class Ex14 {
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length == 0) {
    		return "";
    	}
    	if(strs.length == 1) {
    		return strs[0];
    	}
    	int index = 0;
    	int tag = 0;
    	while(true) {
	        for(int i = 1; i < strs.length; i++) {
	        	if(index >= strs[0].length() || index >= strs[i].length() || strs[i].charAt(index) != strs[0].charAt(index)) {
	        		tag = 1;
	        		break;
	        	}
	        }
	        if(tag == 1) {
	        	return strs[0].substring(0, index);
	        }
	        index++;
    	}
    }
    
    public static void main(String[] args){
    	Ex14 ex14 = new Ex14();
    	String[] strs = {};
    	System.out.println(ex14.longestCommonPrefix(strs));
    }
}

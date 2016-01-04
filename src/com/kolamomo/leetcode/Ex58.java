package com.kolamomo.leetcode;

/**
 * Length of Last Word
 * 
 * <p>Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.<br>
 * If the last word does not exist, return 0. <br>
 * Note: A word is defined as a character sequence consists of non-space characters only.<br><br>
 * 
 * For example,<br> 
 * Given s = "Hello World",<br>
 * return 5.<br>
 * @author jiangchao
 *
 */
public class Ex58 {
	
    public int lengthOfLastWord(String s) {
    	if(s == null) {
    		return 0;
    	}
    	int end = -1;
    	int start = 0;
    	for(int i = s.length() - 1; i >= 0; i--) {
    		if(s.charAt(i) == ' ') {
    			if(end == -1) {
    				continue;
    			} else {
    				start = i+1;
    				break;
    			}
    		} else {
    			if(end == -1) {
    				end = i;
    			}
    		}
    	}
    	if(end == -1) {
    		return 0;
    	} else {
    		return end - start + 1;
    	}  	
    } 

	/*
    public int lengthOfLastWord(String s) {
    	if(s == null) {
    		return 0;
    	}
    	String[] strArr = s.split(" ");
    	if(strArr.length == 0) {
    		return 0;
    	}
    	String lastStr = strArr[strArr.length - 1];
    	return lastStr.length();
    } 
    */
    
    public static void main(String[] args) {
    	Ex58 ex58 = new Ex58();
    	System.out.println(ex58.lengthOfLastWord("hello world"));
    }
}

package com.kolamomo.leetcode;

/**
 * Implement strStr() (字符串子串问题)
 * 
 * <p>Implement strStr(). <br>
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.<br>
 * 
 * @note 暴力法，kmp算法
 * @author Jay
 *
 */
public class Ex28 {    
	//暴力算法
    public int strStr(String haystack, String needle) {
		int index1 = 0;
		int index2 = 0;
		if(haystack.length() < needle.length()) {
			return -1;
		}
		while(index1 < haystack.length() && index2 < needle.length()) {
			if(haystack.charAt(index1) ==  needle.charAt(index2)) {
				index1++;
				index2++;
			} else {
				index1 = index1 - index2 + 1;
				index2 = 0;
			}
		}
		if(index2 == needle.length()) {
			return index1 - index2;
		}
		return -1;
	}

    public static void main(String args[]) {
    	Ex28 ex28 = new Ex28();
    	String a = "abc";
    	String b = "bc";
    	System.out.println(ex28.strStr(a, b));
    }
}

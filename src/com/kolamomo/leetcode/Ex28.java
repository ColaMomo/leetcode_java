package com.kolamomo.leetcode;

public class Ex28 {
//暴力算法，超时
//    public int strStr(String haystack, String needle) {
//    	int index = 0;
//    	if("".equals(needle)) {
//    		return -1;
//    	}
//    	while(index < haystack.length()) {
//    		if(haystack.charAt(index)==needle.charAt(0)) {
//    			int tag = 0;
//    			int i = 1;
//    			for(; i < needle.length() && i < haystack.length() - index; i++) {
//    				if(haystack.charAt(index+i) != needle.charAt(i)) {
//    					tag = 1;
//    					break;
//    				}
//    			}
//    			if(tag == 0 && i == needle.length()) {
//    				return index;
//    			}
//    		} 
//    		index++;
//    	}
//        return -1;
//    }
    
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

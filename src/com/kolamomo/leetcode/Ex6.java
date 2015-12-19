package com.kolamomo.leetcode;

public class Ex6 {
	public String convert(String s, int numRows) {
		if(numRows == 1) {
			return s;
		}
		String[] strArr = new String[numRows];
		for(int i = 0; i < numRows; i++) {
			strArr[i] = "";
		}
		int k = -1;
		int j = -1;
		while(j < s.length() - 1) {
			while(k != numRows - 1 && j < s.length() -1) {
				strArr[++k] += s.charAt(++j);
			}
			while(k != 0 && j < s.length() -1) {
				strArr[--k] += s.charAt(++j);
			}
		}
		String result = "";
	    for(int i = 0; i < numRows; i++) {
	    	for(int r = 0; r < strArr[i].length(); r++) {
	    		result += strArr[i].charAt(r);
	    	}
	    }
	    return result;
	}

	public static void main(String[] args) {
//		Ex6 ex6 = new Ex6();
//		System.out.println(ex6.convert("AB", 1));
		String uri = "/oauth2/authorize";
	    	int index = -1;
	    	if( (index = uri.indexOf(";")) != -1) {
	    		uri = uri.substring(0, index);
	    	}
	    	System.out.println(uri);
	}
}
